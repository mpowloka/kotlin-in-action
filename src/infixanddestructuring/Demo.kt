package infixanddestructuring

infix fun Int.plus(x: Int) = this + x

fun main(args: Array<String>) {
    println(5 plus 10)

    println("---------------------")
    println("collectionsSpread:")
    collectionsSpread()

    println("---------------------")
    println("destructuring:")
    destructuring()
}

fun collectionsSpread() {
    val array1 = arrayOf('a', 'b', 'c', 'd')
    val list2 = listOf(array1)
    //will print array reference instead of its content
    println(list2)
    val list3 = listOf(*array1)
    println(list3)
    //will pass array as an object and 2 other values
    val list4 = listOf(array1, 'e', 'f')
    println(list4)
    //will decompose array to values it contains and add 2 other values
    val list5 = listOf(*array1, 'g', 'h')
    println(list5)

}

fun destructuring() {
    val pair1 = 1 to "one"
    println(pair1.javaClass.simpleName)
    val pair2 = Pair(2, "two")
    println(pair2.javaClass.simpleName)

    val map = mapOf(pair1, pair2)
    println(map)

    val (value1, value2) = pair1
    println(value1)
    println(value2)
}

