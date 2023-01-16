/*
 Mohammad-Reza Fekri - Github: @fekri86114
 The eighth problem of https://www.hackerrank.com
*/
fun main(args: Array<String>) {
    /* test area */
    miniMaxSum(arrayOf(1, 2, 3, 4, 5))
}

// answer -->
fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    var max = 0
    var min = Int.MAX_VALUE
    var sum = 0L
    for (i in 0..arr.size -1) {
        sum += arr[i]
        if (arr[i] > max) max = arr[i]
        if (arr[i] < min) min = arr[i]
    }

    val num1 = sum - max
    val num2 = sum - min
    println("$num1 $num2")
}