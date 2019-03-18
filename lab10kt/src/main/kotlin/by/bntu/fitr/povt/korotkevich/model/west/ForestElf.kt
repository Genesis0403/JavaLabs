package by.bntu.fitr.povt.korotkevich.model.west

import by.bntu.fitr.povt.korotkevich.model.Creature
import by.bntu.fitr.povt.korotkevich.model.Role
import by.bntu.fitr.povt.korotkevich.model.Weapon

class ForestElf(health: Int = 100, strength: Int = 20,
                agility: Int = 50, intelligence: Int = 20,
                val role: Role = Role.RANGER, val weapon: Weapon = Weapon.BOW)
    : Creature(health, strength, agility, intelligence) {

    override val id: String = "ForestElf"

    override fun getSelfDamage() = weapon.damage + buff(role)

    override fun toString() = StringBuilder("ForestElf(").apply {
        append(super.toString())
        append("role: $role, weapon: $weapon)")
    }.toString()
}