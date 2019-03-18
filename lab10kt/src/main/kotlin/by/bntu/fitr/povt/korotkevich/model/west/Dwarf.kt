package by.bntu.fitr.povt.korotkevich.model.west

import by.bntu.fitr.povt.korotkevich.model.Creature
import by.bntu.fitr.povt.korotkevich.model.Role
import by.bntu.fitr.povt.korotkevich.model.Weapon

class Dwarf(health: Int = 200, strength: Int = 50,
            agility: Int = 10, intelligence: Int = 10,
            val role: Role = Role.TANK, val weapon: Weapon = Weapon.HAMMER)
    : Creature(health, strength, agility, intelligence) {

    override val id: String = "Dwarf"

    override fun getSelfDamage() = weapon.damage + buff(role)

    override fun toString() = StringBuilder("Dwarf(").apply {
        append(super.toString())
        append("role: $role, weapon: $weapon)")
    }.toString()
}