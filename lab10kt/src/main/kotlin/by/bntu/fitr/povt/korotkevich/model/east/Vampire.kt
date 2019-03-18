package by.bntu.fitr.povt.korotkevich.model.east

import by.bntu.fitr.povt.korotkevich.model.Creature
import by.bntu.fitr.povt.korotkevich.model.Role
import by.bntu.fitr.povt.korotkevich.model.Weapon
import by.bntu.fitr.povt.korotkevich.model.buff

class Vampire(override val health: Int = 100, override val strength: Int = 20,
              override val agility: Int = 50, override val intelligence: Int = 10,
              val role: Role = Role.THIEF, val weapon: Weapon = Weapon.DAGGER) : Creature() {

    override val id: String = "Vampire"

    override fun getSelfDamage() = weapon.damage + buff(role)

    override fun toString() = StringBuilder("Vampire(").apply {
        append(super.toString())
        append("role: $role, weapon: $weapon)")
    }.toString()
}