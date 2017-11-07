package interfaces

fun main(args : Array<String>) {
    MainClass().showOff()
}

interface Clickable {
    fun showOff() = println("Clickable!")
}

interface Focusable {
    fun showOff() = println("Focusable!")

    fun passFocus(removeFrom: Focusable, giveTo: Focusable) {
        // remove bla bla bla
    }
}

class MainClass : Clickable, Focusable{
    // must override because of 2 different, inherited implementations
    override fun showOff() {
        super<Focusable>.showOff()
        super<Clickable>.showOff()
    }

}