fun main() {
    val names = listOf("pera", "zika", "laza", "mika")
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    for (name in names) {
        val n = name.replaceFirstChar { it.uppercaseChar() }
        println(name)
        println(n)
    }

    for (number in numbers) println(number) // no need for {} when there is only one command

}