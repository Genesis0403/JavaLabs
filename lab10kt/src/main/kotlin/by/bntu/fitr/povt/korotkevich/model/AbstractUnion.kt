package by.bntu.fitr.povt.korotkevich.model

import java.lang.StringBuilder

const val UNIT_DEFAULT_AMOUNT = 30

abstract class AbstractUnion : Union {
    protected val union: MutableMap<Creature, Int> = LinkedHashMap()

    override fun add(creature: Creature, amount: Int) {
        union[creature] = amount
    }

    override fun get(index: Int) = union.asSequence().elementAt(index).toPair()

    override fun getArmy(): Map<Creature, Int> = union.toMap()

    override fun getArmySize() = union.size

    override fun addUnitAmount(id: String, amount: Int) {
        for ((k, v) in union) {
            if (k.id == id) union[k] = v + amount
        }
    }

    override fun containsId(id: String): Boolean
            = union.keys.map { cr: Creature -> cr.id}.contains(id)

    override fun toString(): String {
        return StringBuilder().apply {
            append(unionName())
            append(union.joinToString("\n", "\n", "\n"))
        }.toString()
    }
}

fun <K, V> MutableMap<K, V>.joinToString(prefix: String = "(",
                                         separator: String = ",",
                                         postfix: String = ")")
    = StringBuilder().apply {
    append(prefix)
    var i = 0
    for ((k, v) in this@joinToString) {
        if (i++ > 0) append(separator)
        append("$k: $v")
    }
    append(postfix)
}.toString()