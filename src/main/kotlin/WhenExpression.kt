fun main() {
    val gender = "M"

    val g = when(gender) {
        "F" -> "Female"
        "M" -> "Male"
        else -> "Unknown"
    }

    println(g)
}