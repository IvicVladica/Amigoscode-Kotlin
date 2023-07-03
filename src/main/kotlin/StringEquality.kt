fun main() {
    val name1 = "Sale"
    val name2 = "Jaca"
    val name3 = String("Sale".toCharArray())

    println("== ${name1 == name3}") //is the same as
    println("=== ${name1 === name3}")  //brand new object, different memory location -> false
    println("equals ${name1.equals(name3)}")
}