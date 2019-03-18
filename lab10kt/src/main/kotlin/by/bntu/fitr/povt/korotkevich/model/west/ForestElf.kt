package by.bntu.fitr.povt.korotkevich.model.west

import by.bntu.fitr.povt.korotkevich.model.Creature
import by.bntu.fitr.povt.korotkevich.model.Role
import by.bntu.fitr.povt.korotkevich.model.Weapon
import by.bntu.fitr.povt.korotkevich.model.buff

class ForestElf(override val health: Int = 100, override val strength: Int = 20,
                override val agility: Int = 50, override val intelligence: Int = 20,
                val role: Role = Role.RANGER, val weapon: Weapon = Weapon.BOW) : Creature() {

    override val id: String = "ForestElf"

    override fun getSelfDamage() = weapon.damage + buff(role)

    override fun toString() = StringBuilder("ForestElf(").apply {
        append(super.toString())
        append("role: $role, weapon: $weapon)")
    }.toString()
}