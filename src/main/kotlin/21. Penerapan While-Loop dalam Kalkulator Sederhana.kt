fun main(args: Array<String>) {
    println("Welcome to our calculator")
    var goOn = "yes"
    while (goOn == "yes") {
        println("Enter the first number")
        val a = readLine()!!.toDouble()
        println("Enter the second number:")
        val b = readLine()!!.toDouble()
        println("Choose one of the following operations:")
        println("1 - addition")
        println("2 - subtraction")
        println("3 - multiplication")
        println("4 - division")
        val choice = readLine()!!.toInt()
        var result: Double = 0.0
        when (choice) {
            1 -> result = a + b
            2 -> result = a - b
            3 -> result = a * b
            4 -> result = a / b
        }
        if ((choice > 0) && (choice < 5)) {
            println("Result: $result")
        } else {
            println("Invalid choice")
        }
        println("Would you like to make another calculation? [yes/no]")
        goOn = readLine()!!
    }
    println("Thank you for using our calculator.")
}
