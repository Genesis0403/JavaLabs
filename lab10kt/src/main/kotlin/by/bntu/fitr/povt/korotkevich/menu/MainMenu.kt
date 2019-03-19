package by.bntu.fitr.povt.korotkevich.menu

import by.bntu.fitr.povt.korotkevich.model.Union
import by.bntu.fitr.povt.korotkevich.model.battle
import by.bntu.fitr.povt.korotkevich.model.east.EastUnion
import by.bntu.fitr.povt.korotkevich.model.getIds
import by.bntu.fitr.povt.korotkevich.model.west.WestUnion
import java.lang.StringBuilder
import java.util.*

class MainMenu : Menu() {
    private val addMenu = AddMenu()
    private val showMenu = ShowMenu()
    private val battleMenu = BattleMenu()

    init {
        add("Add units") { addMenu.run() }
        add("Show unions") { showMenu.run() }
        add("Battle") { battleMenu.run() }
    }
}

class AddMenu : Menu() {
    private val sc = Scanner(System.`in`)

    init {
        add("Add to East") { addUnits(EastUnion) }
        add("Add to West") { addUnits(WestUnion) }
    }

    private fun addUnits(union: Union) {
        val unionIds = union.getIds()
        val question = StringBuilder("Choose troop:\n").apply {
            unionIds.forEachIndexed { i, v -> append("${i + 1}. $v\n") }
        }.toString()
        val option = validateAndReturn(question) {option -> option <= 0 || option > unionIds.size}
        val amount = validateAndReturn("Input amount:") {amount -> amount < 0}
        EastUnion.addUnitAmount(unionIds[option - 1], amount)
    }
}

class ShowMenu : Menu() {
    init {
        add("Show East") { println(EastUnion) }
        add("Show West") { println(WestUnion) }
    }
}

class BattleMenu : Menu() {
    private val unions: List<Union> = listOf(EastUnion, WestUnion)

    init {
        for (union in unions) {
            add(union.unionName()) {
                val question = StringBuilder("Who to attack:\n").apply {
                    unions.forEachIndexed { i, v -> append("${i + 1}. ${v.unionName()}\n") }
                }.toString()

                val option = validateAndReturn(question) {
                    option -> option <= 0 || option > unions.size || option - 1 == unions.indexOf(union)
                }

                println("Unions before battle:\n$union\n${unions[option-1]}")
                union.battle(unions[option - 1])
                println("Unions after battle:\n$union\n${unions[option-1]}")
            }
        }
    }
}