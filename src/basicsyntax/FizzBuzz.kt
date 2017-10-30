package basicsyntax

fun fizzBuzz(i: Int) = when{
    i%15 == 0 -> "FizzBuzz"
    i%5 == 0 -> "Buzz"
    i%3 == 0 -> "Fizz"
    else -> "$i"
}

fun main(args: Array<String>) {
    for (i in 1..100) println(fizzBuzz(i))
    println()
    println("Next round")
    println()
    for (i in 100 downTo 1 step 2) println(fizzBuzz(i))
}