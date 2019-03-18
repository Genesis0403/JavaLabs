package by.bntu.fitr.povt.korotkevich

fun main() {
    val a = mapOf(1 to 1)
    val b = a as MutableMap

    b[2] = 2

    print(a)
}