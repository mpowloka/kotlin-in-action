package functions.utils


fun Collection<Any>.customToString
        (prefix: String = "(",
         postfix: String = ")",
         separator: String = ", ") :String {

    val result = StringBuilder()
    result.append(prefix)
    for ((index, element) in this.withIndex()) {
        if(index > 0)result.append(separator)
        result.append(element.toString())
    }
    result.append(postfix)

    return result.toString()


}
