package by.bntu.fitr.povt.korotkevich.model.west

import by.bntu.fitr.povt.korotkevich.model.Creature
import by.bntu.fitr.povt.korotkevich.model.Role
import by.bntu.fitr.povt.korotkevich.model.Weapon
import by.bntu.fitr.povt.korotkevich.model.buff

class Dwarf(override val health: Int = 200, override val strength: Int = 50,
            override val agility: Int = 10, override val intelligence: Int = 10,
            val role: Role = Role.TANK, val weapon: Weapon = Weapon.HAMMER) : Creature() {

    override val id: String = "Dwarf"

    override fun getSelfDamage() = weapon.damage + buff(role)

    override fun toString() = StringBuilder("Dwarf(").apply {
        append("${super.toString()}, role: $role, weapon: $weapon)")
    }.toString()
}