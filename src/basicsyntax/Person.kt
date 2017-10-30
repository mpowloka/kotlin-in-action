package basicsyntax

class Person(val name: String, val surname: String, val id: Int) {
    val signature: String
    get() = "$name $surname"
}