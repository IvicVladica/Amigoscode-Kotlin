fun main() {
     greet("Amigos",22)
     greet("Coder", 15)
     greet("check")
    //
    foo(bar = {
        println("bar as a function")
    })
    foo {
        println("bar as a function2")
    }
    foo()
    //
    println(double(5))
    println(twoValues())
    println(threeValues())
    val (v1, v2) = twoValues()
    println("$v1 $v2")
}

fun foo(bar: () -> Unit = {}) {
    println("bar function")
    bar()
}

fun greet(name: String, age: Int = -1) {
    // println("Hello $name")
    if (age == -1) {
        println("Age not provided\n")
        return
    }
    if (age > 18) println("$name is an adult")
    else println("$name is not an adult")
}

//fun double(n: Int) : Int {
//    return n * 2
//}

    fun double(n: Int): Int = n * 2

/// multiple values return

    fun twoValues(): Pair<String, Int>  {
        return "Amigos" to 20
    }

    fun threeValues(): Triple<String, Int, Char> {
        return Triple(
            "Amigos",
            20,
            'A'
        )
    }