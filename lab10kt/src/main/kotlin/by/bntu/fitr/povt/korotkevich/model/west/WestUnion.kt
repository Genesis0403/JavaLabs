package by.bntu.fitr.povt.korotkevich.model.west

import by.bntu.fitr.povt.korotkevich.model.AbstractUnion
import by.bntu.fitr.povt.korotkevich.model.UNIT_DEFAULT_AMOUNT

object WestUnion : AbstractUnion() {
    init {
        union[Human()] = UNIT_DEFAULT_AMOUNT
        union[Dwarf()] = UNIT_DEFAULT_AMOUNT
        union[ForestElf()] = UNIT_DEFAULT_AMOUNT
    }

    override fun unionName() = "West Union"
}