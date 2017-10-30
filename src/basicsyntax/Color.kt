package basicsyntax

enum class Color (val r: Int, val g: Int, val b: Int) {

    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b

    fun getColorName(color: Color) =
            when(color) {
                RED, ORANGE -> "Red-ish"
                YELLOW -> "Yellow"
                else -> "Not yellow or red-ish"
            }

    fun mix(c1: Color, c2: Color) = when(setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

    fun optimizedMix(c1: Color, c2: Color) = when {
        (c1 == RED && c2 == YELLOW) || (c1==YELLOW && c2==RED) -> ORANGE
        (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
        (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> INDIGO
        else -> throw Exception("Dirty color")
    }
}