package by.bntu.fitr.povt.korotkevich.model.east

import by.bntu.fitr.povt.korotkevich.model.Creature
import by.bntu.fitr.povt.korotkevich.model.Role
import by.bntu.fitr.povt.korotkevich.model.Weapon
import by.bntu.fitr.povt.korotkevich.model.buff

class DarkElf(override val health: Int = 80, override val strength: Int = 5,
              override val agility: Int = 5, override val intelligence: Int = 50,
              val role: Role = Role.SORCERER, val weapon: Weapon = Weapon.STUFF) : Creature() {

    override val id: String = "DarkElf"

    override fun getSelfDamage() = weapon.damage + buff(role)

    override fun toString() = StringBuilder("DarkElf(").apply {
        append("${super.toString()}, role: $role, weapon: $weapon)")
    }.toString()
}