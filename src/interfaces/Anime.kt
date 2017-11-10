package interfaces

interface Villan{
    fun attac()
    fun steal()
}

interface Hero {
    fun protec()
    fun quest()
}

class Orc : Villan {
    override fun attac() {
        println("AXE IT")
    }

    override fun steal() {
        println("STEALY")
    }
}

// delegation
class RoboOrc(val host: Villan = Orc()) : Villan by host {
    override fun attac() {
        println("BOMB IT")
    }

    // fun steal inherited from host
}

object RoboCop : Hero{

    override fun protec() = println("Serve and protec")

    override fun quest() = println("Serve and quest")

}

class ProtecDrone private constructor() : Hero {
    override fun protec() = println("PROTEC PROTEC")
    override fun quest() = println("QUEST QUEST")

    // factory
    companion object {
        fun newProtecDrone() = ProtecDrone()
    }
}