fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (n in nums) {
        if (n % 2 != 0) continue   // skips when condition is reached
        if (n > 5) break
        println(n)
    }
    println("some other code")
}