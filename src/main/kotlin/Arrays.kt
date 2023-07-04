fun main() {
    val names = arrayOf(
        "Pera", "Mika"
    )
    println(names[0])
    println(names[1])
    names[0] = "Laza"
    println(names.size)

    if ("Hello" in names) {
        println("Found")
    } else {
        println("Not found")
    }

    println(names.contentToString())

    val arrayOfNulls =
        arrayOfNulls<String>(5)
        arrayOfNulls.fill("*")
        arrayOfNulls[4] = "Hello"
        println(arrayOfNulls.contentToString())

}