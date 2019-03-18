package by.bntu.fitr.povt.korotkevich.model.east

import by.bntu.fitr.povt.korotkevich.model.AbstractUnion
import by.bntu.fitr.povt.korotkevich.model.UNIT_DEFAULT_AMOUNT

object EastUnion : AbstractUnion() {
    init {
        union[Beast()] = UNIT_DEFAULT_AMOUNT
        union[Vampire()] = UNIT_DEFAULT_AMOUNT
        union[DarkElf()] = UNIT_DEFAULT_AMOUNT
    }

    override fun unionName() = "East Union"
}