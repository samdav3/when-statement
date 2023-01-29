fun main(args: Array<String>) {
    var day = 60
    var dayString = "x"

    when (day) {
        1 -> dayString = "Sunday"
        2 -> dayString = "Monday"
        3 -> dayString = "Tuesday"
        4 -> dayString = "Wednesday"
        5 -> dayString = "Thursday"
        6 -> dayString = "Friday"
        7 -> dayString = "Saturday"
        !in 1..7 -> dayString = "out of range"
        else -> dayString = "Unknown"
    }

    println("The day is $dayString")
}