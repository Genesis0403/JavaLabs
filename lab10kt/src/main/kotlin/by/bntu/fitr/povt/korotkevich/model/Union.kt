package by.bntu.fitr.povt.korotkevich.model

import kotlin.random.Random

interface Union {
    fun add(creature: Creature, amount: Int)
    fun get(index: Int): Pair<Creature, Int>
    fun getArmy(): Map<Creature, Int>
    fun addUnitAmount(id: String, amount: Int)
    fun getArmySize(): Int
    fun unionName(): String
    fun containsId(id: String): Boolean //TODO make as an extension function
}

fun Union.getIds()
        = getArmy().asSequence().map { cr -> cr.key }.map {cr -> cr.id}.toList()

fun Union.battle(other: Union) {
    val otherTroop = other.get(Random.nextInt(other.getArmySize()))
    val thisTroop = get(Random.nextInt(getArmySize()))
    when (Random.nextInt(2)) {
        0 -> add(thisTroop.first, countUnitAmount(thisTroop, otherTroop))
        1 -> other.add(otherTroop.first, countUnitAmount(otherTroop, thisTroop))
    }
}
private fun countUnitAmount(firstTroop: Pair<Creature, Int>, troop: Pair<Creature, Int>): Int {
    val damage = troop.first.getSelfDamage() * troop.second
    val totalHealth = firstTroop.first.health * firstTroop.second
    val result = (totalHealth - damage) / firstTroop.first.health
    return if (result < 0) 0 else result
}
