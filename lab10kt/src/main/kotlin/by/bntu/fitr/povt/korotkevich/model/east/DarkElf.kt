package by.bntu.fitr.povt.korotkevich.model.east

import by.bntu.fitr.povt.korotkevich.model.Creature
import by.bntu.fitr.povt.korotkevich.model.Role
import by.bntu.fitr.povt.korotkevich.model.Weapon

class DarkElf(health: Int = 80, strength: Int = 5,
              agility: Int = 5, intelligence: Int = 50,
              val role: Role = Role.SORCERER, val weapon: Weapon = Weapon.STUFF)
    : Creature(health, strength, agility, intelligence) {

    override val id: String = "DarkElf"

    override fun getSelfDamage() = weapon.damage + buff(role)

    override fun toString() = StringBuilder("DarkElf(").apply {
        append(super.toString())
        append("role: $role, weapon: $weapon)")
    }.toString()
}