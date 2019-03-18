package by.bntu.fitr.povt.korotkevich.model.west

import by.bntu.fitr.povt.korotkevich.model.Creature
import by.bntu.fitr.povt.korotkevich.model.Role
import by.bntu.fitr.povt.korotkevich.model.Weapon

class Human(health: Int = 100, strength: Int = 30,
            agility: Int = 20, intelligence: Int = 20,
            val role: Role = Role.KNIGHT, val weapon: Weapon = Weapon.SWORD)
    : Creature(health, strength, agility, intelligence) {

    override val id: String = "Human"

    override fun getSelfDamage() = weapon.damage + buff(role)

    override fun toString() = StringBuilder("Human(").apply {
        append(super.toString())
        append("role: $role, weapon: $weapon)")
    }.toString()
}