package by.bntu.fitr.povt.korotkevich.model

import by.bntu.fitr.povt.korotkevich.model.Role.*

interface Buff {
    fun buff(role: Role): Int
}

abstract class Creature(val health: Int, val strength: Int,
                        val agility: Int, val intelligence: Int) : Buff {
    abstract fun getSelfDamage(): Int

    final override fun buff(role: Role) = (when(role) {
        KNIGHT -> health
        SORCERER -> intelligence
        RANGER -> agility
        TANK -> strength
        THIEF -> agility
    } * role.buffPercent).toInt()

    override fun toString() = StringBuilder().apply {
        append("health: $health, strength: $strength, ")
        append("agility: $agility, intelligence: $intelligence")
    }.toString()
}