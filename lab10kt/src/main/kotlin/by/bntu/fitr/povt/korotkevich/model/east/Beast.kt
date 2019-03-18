package by.bntu.fitr.povt.korotkevich.model.east

import by.bntu.fitr.povt.korotkevich.model.Creature
import by.bntu.fitr.povt.korotkevich.model.Role
import by.bntu.fitr.povt.korotkevich.model.Weapon
import by.bntu.fitr.povt.korotkevich.model.buff

data class Beast(override val health: Int = 200, override val strength: Int = 50,
                 override val agility: Int = 10, override val intelligence: Int = 10,
                 val role: Role = Role.TANK, val weapon: Weapon = Weapon.HAMMER) : Creature() {

    override val id = "Beast"

    override fun getSelfDamage() = weapon.damage + buff(role)

    override fun toString() = StringBuilder("Beast(").apply {
        append(super.toString())
        append("role: $role, weapon: $weapon)")
    }.toString()
}