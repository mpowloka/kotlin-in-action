package infixanddestructuring

infix fun Int.plus(x: Int) = this + x

fun main(args: Array<String>) {
    println(5 plus 10)

    val (x, y) = Pair(1, "one")

    print("$x, $y")
}

