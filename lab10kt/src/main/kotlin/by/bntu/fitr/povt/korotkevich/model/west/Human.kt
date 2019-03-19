package by.bntu.fitr.povt.korotkevich.model.west

import by.bntu.fitr.povt.korotkevich.model.Creature
import by.bntu.fitr.povt.korotkevich.model.Role
import by.bntu.fitr.povt.korotkevich.model.Weapon
import by.bntu.fitr.povt.korotkevich.model.buff

class Human(override val health: Int = 100, override val strength: Int = 30,
            override val agility: Int = 20, override val intelligence: Int = 20,
            val role: Role = Role.KNIGHT, val weapon: Weapon = Weapon.SWORD) : Creature() {

    override val id: String = "Human"

    override fun getSelfDamage() = weapon.damage + buff(role)

    override fun toString() = StringBuilder("Human(").apply {
        append("${super.toString()}, role: $role, weapon: $weapon)")
    }.toString()
}