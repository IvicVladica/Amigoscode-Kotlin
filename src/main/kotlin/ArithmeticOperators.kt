import kotlin.math.*

fun main() {
    val number1 = 10
    val number2 = 2
    println(number1+number2)


    // Math //

    println("Math collection")
    println(kotlin.math.PI)
    println(min(number1, number2))
    println(sqrt(5.0))
    println(round(4.6))


    // ++ and --

    println("Anc and Dec operators")
    var number = 10
    println(number++)  //returns then increments
    println(number)
    println(++number)  //increments, then returns
    println(number--)
    println(number)
    println(--number)


}