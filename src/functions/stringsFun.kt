package functions
import functions.utils.customCollectionToString
import functions.utils.packageToPath
import functions.utils.customToString
import java.util.*
import functions.utils.pathToPackage as customName


const val lineSeparator = "----------------"

fun main(args: Array<String>) {
    val list = listOf(1,6,8,10)
    println(customCollectionToString(list))
    println(lineSeparator)
    println(
            customCollectionToString(collection = list, separator = " : ")
    )

    stringExtensionsDemo()

    println("Collection extension demo:")
    println(listOf<Any>(Random(), 5, "asdasdasd").customToString(prefix = "[", postfix = "]", separator = "-"))
    println(setOf<Any>(1, 5, 123, "asd", 'X').customToString(separator = "  ->(---)<-  "))
}

fun stringExtensionsDemo(){

    println("main.michal.powloka".packageToPath())
    println("src/main/java/persistance".customName())

}