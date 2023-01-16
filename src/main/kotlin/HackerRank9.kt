/*
 Mohammad-Reza Fekri - Github: @fekri86114
 The ninth problem of https://www.hackerrank.com
*/
fun main(args: Array<String>) {
    /* test area */
    println(birthdayCakeCandle(arrayOf(3, 2, 1, 3)))
}

// answer -->
fun birthdayCakeCandle(candle: Array<Int>): Int {
    // Write your code here
    var max = 0
    var repeat = 0
    //step one
    for (i in 0..candle.size - 1) {
        if (candle[i] > max) max = candle[i]
    }
    //step two
    for (i in 0..candle.size - 1) {
        if (candle[i] == max) repeat++
    }

    return repeat
}