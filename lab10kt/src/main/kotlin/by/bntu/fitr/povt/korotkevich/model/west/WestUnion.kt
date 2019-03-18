package by.bntu.fitr.povt.korotkevich.model.west

import by.bntu.fitr.povt.korotkevich.model.AbstractUnion

const val UNIT_DEFAULT_AMOUNT = 30

object WestUnion : AbstractUnion() {
    init {
        union[Human()] = UNIT_DEFAULT_AMOUNT
        union[Dwarf()] = UNIT_DEFAULT_AMOUNT
        union[ForestElf()] = UNIT_DEFAULT_AMOUNT
    }
}