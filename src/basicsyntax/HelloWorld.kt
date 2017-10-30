package basicsyntax

fun main (args: Array<String>) {
    if (blockBodyMax(5,10) == expressionBodyMax(5, 10))
    println(sayHello("World"))
    println(saySophisticatedHello("Lady Cassandra"))
    println(saySophisticatedHello("Archduke Bill Cypher"))

}

fun sayHello(toWhom: String) = "Hello $toWhom!"

fun saySophisticatedHello(toWhom: String) = "Hello ${if (toWhom.substring(0, 4).equals("Lady"))
    "$toWhom, we've been awaiting you!"
    else "$toWhom!"}"

fun blockBodyMax(x: Int, y: Int): Int {
    return if (x>y) x else y
}

fun expressionBodyMax(x: Int, y: Int) = if (x>y) x else y


