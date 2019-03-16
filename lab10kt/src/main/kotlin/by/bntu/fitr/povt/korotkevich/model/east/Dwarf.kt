package by.bntu.fitr.povt.korotkevich.model.east

import by.bntu.fitr.povt.korotkevich.model.Creature
import by.bntu.fitr.povt.korotkevich.model.Role
import by.bntu.fitr.povt.korotkevich.model.Weapon
import java.lang.StringBuilder

class Dwarf(health: Int, strength: Int,
            agility: Int, intelligence: Int,
            val role: Role, val weapon: Weapon) : Creature(health, strength, agility, intelligence) {

    override fun getSelfDamage() = weapon.damage + buff(role)

    override fun toString() = StringBuilder("Dwarf(").apply {
        append(super.toString())
        append("role: $role, weapon: $weapon)")
    }.toString()
}