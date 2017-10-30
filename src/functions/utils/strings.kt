@file:JvmName("StringUtils")
package functions.utils

fun <T> customCollectionToString (
        collection: Collection<T>,
        prefix: String = "(",
        separator: String = ", ",
        sufix: String = ")"
) :String {
    val builder = StringBuilder(prefix)
    for( (index, element) in collection.withIndex() ) {
        if (index > 0) builder.append(separator)
        builder.append(element)
    }
    builder.append(sufix)
    return builder.toString()
}
@JvmOverloads
fun <T> customCollectionToStringForJava (
        collection: Collection<T>,
        prefix: String = "(",
        separator: String = ", ",
        sufix: String = ")"
) :String {
    val builder = StringBuilder(prefix)
    for( (index, element) in collection.withIndex() ) {
        if (index > 0) builder.append(separator)
        builder.append(element)
    }
    builder.append(sufix)
    return builder.toString()
}


