@file: JvmName("DoubleArrayUtil")

package by.bntu.fitr.povt.korotkevich.lab11.model

fun DoubleArray.countInRange(first: Int, second: Int): Int
        = asSequence().count { el -> el > first && el < second}

fun DoubleArray.sumAfterMax(): Double {
    val index = max()?.let { indexOf(it) } ?: return .0
    return asSequence().filter {d -> indexOf(d) > index}.sum()
}

fun DoubleArray.sumBetweenTwoFirstPositives(): Double {
    fun findPositives(array: DoubleArray): IntArray {
        var count = 0
        val positives = IntArray(2)
        for ((index, el) in array.withIndex()) {
            if (count < 2 && el > 0) {
                positives[count++] = index
            }
        }
        return positives
    }

    val positives = findPositives(this)
    return asSequence().filter {el -> indexOf(el) > positives[0] && indexOf(el) < positives[1]}.sum()
}