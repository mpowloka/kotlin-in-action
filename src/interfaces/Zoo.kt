package interfaces

import java.util.*

// empty interface
interface Mammal

// Camel does not implement it on purpose
interface Dimensional {
    val dimX: Int
    val dimY: Int
    val dimZ: Int
    // :O
    val dimA: Int
    val sum
    get() = dimX + dimY + dimZ + 42*dimA
}

sealed class AvailableMammal(var age: Int) : Mammal{



    //explicit constructor (required to use init construction), _age passed do super constructor
    class Seal constructor(_age: Int, length: Int) : AvailableMammal(_age) {
        var length : Int
        init {
            this.length = length
        }
    }

    //half explicit constructor
    class Lion (_age : Int, roarType : String) : AvailableMammal(_age) {
        var roarType = roarType

    }

    class Camel private constructor(dimX: Int, dimY: Int, dimZ: Int, _age: Int) : AvailableMammal(_age) {
        // public, secondary constructor calling private, primary constructor
        constructor(args: Array<Int>) : this(args[0], args[1], args[2], args[3])

    }

    // overriding properties in every possible way :O
    class MemeMan(override val dimX: Int, override val dimY: Int) : AvailableMammal(-42), Dimensional {
        override val dimZ = 1
        override val dimA: Int
        get() = Random().nextInt()
    }

    class Shapeshifter(val _age: Int) : AvailableMammal(_age) {
        // custom properties showoff
        var shape = "default"
            set(value: String) {
                if (value.length > 15) throw IllegalAccessException()
                field = value
            }
            get() = field.trim()

    }

}
