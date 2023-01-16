/*
* Example: BallShop
* A person named Hassan orders balls from a shop. He has been shopping for three times(months).
* In the first time(month), he buys 10 balls for 1000 Tomans each.
* In the second time(month), he buys 20 balls at the price of 1500 Tomans each,
* and in the third time(month), he buys 30 balls at the price of 2000 Tomans each.
* The types of balls are the same, but the prices are different.
* He wants to calculate how much each ball costs on average.
* Help him find the solution :-)
* HELP: The answer is '1666' Tomans
* */

fun main() {
    print("Enter the number of times that you got shopping_")
    val severalTimes: Int = readLine()!!.toInt()
    println("How many balls have you bought in each series? ")
    val howMany = mutableListOf<Int>()
    val price = mutableListOf<Int>()

    for (i in 1..severalTimes) {
        howMany.add(readLine()!!.toInt())
    }
    println(howMany)

    println("How much Tomans did you pay for each time?")
    for (i in 1..3) {
        price.add(readLine()!!.toInt())
    }
    println(price)

    val answer =
        ( (howMany[0] * price[0]) + (howMany[1] * price[1]) + (howMany[2] * price[2]) ) / (howMany[0] + howMany[1] + howMany[2])
//       ((10*1000) + (20*1500) + (30*2000)) / (10+20+30) = 1666
    println("The answer: $answer")
}