package lambada

data class Person(val name: String, val surname: String, var age: Int)
fun main(args: Array<String>) {
    val employees = listOf(
            Person("Michal", "Powloka", 21),
            Person(name = "Tomasz", surname = "Michlewski", age = 21),
            Person("Bill", "Cypher", 42)
            )

    simpleMaxBy(employees)
    println("--------------------------")
    simpleSort(employees)
}

private fun simpleMaxBy(employees: List<Person>) {
    println(
            employees.maxBy { it.age }
    )
    //equals
    println(
            employees.maxBy() { p -> p.age }
    )
    //equals
    println(
            employees.maxBy({ p: Person -> p.age })
    )
}

private fun simpleSort(employees: List<Person>) {
    println() { employees.sortedBy { it.age } }
}