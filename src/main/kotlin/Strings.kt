fun main() {
    val name = "Amigos"
    println(name)
    println(name.uppercase())
    println(name.lowercase())
    println(name.length)
    println(name[2])
    println("".isEmpty())

    val age = 20
    val msg = "$name $age"
    println(msg)

    val email = """
        Hello %s
          How
        Are you
    """.trimIndent()
    println(email.format("Ana"))
}