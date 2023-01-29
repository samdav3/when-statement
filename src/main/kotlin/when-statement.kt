import java.util.Scanner

fun main(args: Array<String>) {
    var int: Int? = null
    val reader = Scanner(System.`in`)
    var numString = "x"
    print("Enter a number: ")
    var integer:Int = reader.nextInt()

    when (integer) {
        1 -> numString = "uno"
        2 -> numString = "dos"
        3 -> numString = "tres"
        4 -> numString = "quatro"
        5 -> numString = "cinco"
        6 -> numString = "seis"
        7 -> numString = "siete"
        8 -> numString = "ocho"
        9 -> numString = "nueve"
        10 -> numString = "diez"
        !in 1..10 -> numString = "out of range"
        else -> numString = "Unknown"
    }

    println("The number $integer in Spanish is $numString.")
}