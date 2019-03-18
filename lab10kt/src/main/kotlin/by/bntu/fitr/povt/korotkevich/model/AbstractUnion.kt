package by.bntu.fitr.povt.korotkevich.model

abstract class AbstractUnion : Union {
    protected val union: MutableMap<Creature, Int>  = LinkedHashMap()

    override fun add(creature: Creature, amount: Int) {
        union[creature] = amount
    }

    override fun get(index: Int) = union.asSequence().elementAt(index).toPair()

    override fun getArmy(): Map<Creature, Int> = union.toMap()

    override fun getArmySize() = union.size

    override fun addUnitAmount(id: String, amount: Int) {
        for ((k,v) in union) {
            if (k.id == id) union[k] = v + amount
        }
    }

}