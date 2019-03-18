package by.bntu.fitr.povt.korotkevich.model

import by.bntu.fitr.povt.korotkevich.model.Role.*

abstract class Creature {

    abstract val id: String
    abstract val health: Int
    abstract val strength: Int
    abstract val agility: Int
    abstract val intelligence: Int

    abstract fun getSelfDamage(): Int

    override fun toString() = StringBuilder().apply {
        append("health: $health, strength: $strength, ")
        append("agility: $agility, intelligence: $intelligence")
    }.toString()
}

fun Creature.buff(role: Role)= (when(role) {
    KNIGHT -> health
    SORCERER -> intelligence
    RANGER -> agility
    TANK -> strength
    THIEF -> agility
} * role.buffPercent).toInt()
