package lambada

fun main(args: Array<String>) {
    val persons = listOf(
            Person("Michal", "Powloka", 21),
            Person(name = "Tomasz", surname = "Michlewski", age = 21),
            Person("Bill", "Cypher", 42)
    )

    val numbers = (0..100).toList()

    val countries = mapOf(
            "Poland" to "PL",
            "Great Britain" to "GB",
            "United States of America" to "USA",
            "Germany" to "GER",
            "China" to "CHRL"
    )

    numbersOperations(numbers)

    printhr()
    printhr()

    personsOperations(persons)

    printhr()
    printhr()

    countriesOperations(countries)
}

fun numbersOperations(numbers: List<Int>) {
    println(numbers.filter{ it % 2 == 0 })
    printhr()

    println(numbers.filter{ it > 88 })
    printhr()

    println(numbers.map{it*it})
    printhr()

    // not changed after mapping
    println(numbers)
    printhr()
}

fun personsOperations(persons: List<Person>) {
    println(persons.filter { it.name.contains("ill") })
    printhr()

    println(persons.map { it.age=666; it; })
    printhr()

    println(persons.map(Person::name))
    printhr()

    //changed after mapping
    println(persons.filter{ it.age > 30 }.map(Person::surname))
    printhr()

    val isHeVillan = {p: Person -> p.surname == "Cypher"}
    println(persons.all(isHeVillan))
    printhr()

    println(persons.any(isHeVillan))
    printhr()

    println(persons.count(isHeVillan))
    printhr()

    println(persons.find(isHeVillan))
    printhr()
}

fun countriesOperations(countries: Map<String, String>) {

    println(countries.filter { it.key.length > 6 }.map { it.value })
    printhr()

    println(countries.filterValues { it.length < 3 })
    printhr()

    println(countries.filterKeys { !it.contains(" ") }.map { it.key })

}

fun printhr() = println("-----------------------")