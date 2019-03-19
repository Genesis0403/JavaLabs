package by.bntu.fitr.povt.korotkevich.menu

import by.bntu.fitr.povt.korotkevich.model.Union
import by.bntu.fitr.povt.korotkevich.model.battle
import by.bntu.fitr.povt.korotkevich.model.east.EastUnion
import by.bntu.fitr.povt.korotkevich.model.getIds
import by.bntu.fitr.povt.korotkevich.model.west.WestUnion
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

    private fun addUnits(union: Union) { //TODO try to think about predicate refactor or as submenu
        val unionIds = union.getIds()
        unionIds.forEachIndexed { i, v -> println("${i + 1}. $v") }
        var option: Int
        var amount: Int
        do {
            try {
                println("Choose troop:")
                option = sc.nextInt()
                println("Input amount:")
                amount = sc.nextInt()
            } catch (e: Exception) {
                println("Wrong input!")
                option = -1 //TODO crutch
                amount = -1
            }
        } while (option <= 0 || option > unionIds.size || amount < 0)
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

    init { //TODO create something more flexible
        for (union in unions) {
            add(union.unionName()) {
                val sc = Scanner(System.`in`)
                var option: Int
                do {
                    println("Who to attack:")
                    unions.forEachIndexed { i, v -> println("${i + 1}. ${v.unionName()}") }
                    option = try {
                        sc.nextInt()
                    } catch (e: Exception) {
                        println("Invalid input!")
                        -1
                    }
                } while (option <= 0 || option > unions.size || option - 1 == unions.indexOf(union))
                println("Unions before battle:\n$union\n${unions[option-1]}")
                union.battle(unions[option - 1])
                println("Unions after battle:\n$union\n${unions[option-1]}")
            }
        }
    }
}