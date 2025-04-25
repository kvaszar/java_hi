package dz3

fun main() {
    val x = "abcba"
    println("$x: ${isPalindrome(x)}")
    val y = "abc"
    println("$y: ${isPalindrome(y)}")
}

fun isPalindrome(str:String): Boolean = str == str.reversed()