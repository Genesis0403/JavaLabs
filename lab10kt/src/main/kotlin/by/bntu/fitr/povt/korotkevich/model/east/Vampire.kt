package by.bntu.fitr.povt.korotkevich.model.east

import by.bntu.fitr.povt.korotkevich.model.Creature
import by.bntu.fitr.povt.korotkevich.model.Role
import by.bntu.fitr.povt.korotkevich.model.Weapon

class Vampire(health: Int = 100, strength: Int = 20,
              agility: Int = 50, intelligence: Int = 10,
              val role: Role = Role.THIEF, val weapon: Weapon = Weapon.DAGGER)
    : Creature(health, strength, agility, intelligence) {

    override val id: String = "Vampire"

    override fun getSelfDamage() = weapon.damage + buff(role)

    override fun toString() = StringBuilder("Vampire(").apply {
        append(super.toString())
        append("role: $role, weapon: $weapon)")
    }.toString()
}