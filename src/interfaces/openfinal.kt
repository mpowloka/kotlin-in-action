package interfaces

open class Animal {
    open fun makeNoise() = println("I'm an animal!!!")
    // cannot be overriden
    fun isAnimal(a : Any) = a is Animal
}

class Doge : Animal() {
    override fun makeNoise() = println("I'm a doge!!!")

    // final by default
    // override fun isAnimal()
}


// final by default
// class SuperDoge : Doge() {}
