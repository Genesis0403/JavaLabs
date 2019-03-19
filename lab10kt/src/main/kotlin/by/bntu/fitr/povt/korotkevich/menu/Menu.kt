package by.bntu.fitr.povt.korotkevich.menu

import java.util.*

open class Menu {
    private val commands: MutableMap<String, () -> Unit> = LinkedHashMap()
    private val commandsNames: MutableList<String> = LinkedList()
    private var scanner = Scanner(System.`in`)
    private var isDone = false

    init {
        commands["Exit"] = { isDone = true}
        with(commandsNames) { add(size, "Exit") }
    }

    fun add(name: String, cmd: () -> Unit) = apply {
            commandsNames.add(name)
            commands[name] = cmd
        }

    private fun onExit() { isDone = false }

    fun run() {
        while (!isDone) {
            print("\nChoose option:\n" + toString())
            var isCorrect = false
            try {
                while (!isCorrect) {
                    val option = scanner.nextInt()
                    commands[commandsNames[option]]!!.invoke()
                    isCorrect = true
                }
            } catch (e: Exception) {
                System.err.println(e)
            }
        }
        onExit()
    }

    override fun toString() = StringBuilder().apply {
        commandsNames.withIndex().forEach { (index, value) -> append("$index. $value\n") }
    }.toString()
}
