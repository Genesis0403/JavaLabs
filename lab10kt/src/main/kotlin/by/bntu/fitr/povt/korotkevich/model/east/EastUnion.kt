package by.bntu.fitr.povt.korotkevich.model.east

import by.bntu.fitr.povt.korotkevich.model.AbstractUnion

const val UNIT_DEFAULT_AMOUNT = 30

object EastUnion : AbstractUnion() {
    init {
        union[Beast()] = UNIT_DEFAULT_AMOUNT
        union[Vampire()] = UNIT_DEFAULT_AMOUNT
        union[DarkElf()] = UNIT_DEFAULT_AMOUNT
    }
}