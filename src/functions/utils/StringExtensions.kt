package functions.utils

fun String.pathToPackage() = this.replace(oldChar = '/', newChar = '.')

fun String.packageToPath() = this.replace(oldChar = '.', newChar = '/')

