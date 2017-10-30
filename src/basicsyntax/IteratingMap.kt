package basicsyntax

import java.util.*
import basicsyntax.Color.*

fun main(args: Array<String>) {

    val map = TreeMap<Char, Int>()

    for(c in 'A'..'F') {
        map[c] = c.toInt()
    }

    for( (c, i) in map ) {
        println("$c = $i")
    }

    //BONUS

    val list = listOf<Color>(RED, BLUE, INDIGO, VIOLET)
    for ((index, color) in list.withIndex()) println("$index = $color")
}