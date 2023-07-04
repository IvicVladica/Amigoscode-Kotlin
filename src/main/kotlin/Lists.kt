fun main() {
    val names = mutableListOf<String>(
        "Pera",
        "Mika",
        "Laza",
        "Zika"
    )

    println(names[0])
    println(names.size)
    println(names.contains("Pera"))
    println(names.first())
    names.add(4, "Raca")
    names.remove("Raca")
    println(names)

    val (one, two) = names
    val (one1, _, _, four) = names
    println("$one $two")
    println("$one1 $four")
    
}