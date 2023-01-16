/*
 Mohammad-Reza Fekri - Github: @fekri86114
 The sixth problem of https://www.hackerrank.com
*/
fun main(args: Array<String>) {
    /* test area */
    val array = arrayOf(-4, 3, -9, 0, 4, 1)

    println(plusMinus(array))
}

// answer -->
fun plusMinus(arr: Array<Int>): Unit {
    // write your code here
    val arraySize = arr.size
    var numberPositive = 0f
    var numberNegative = 0f
    var numberZero = 0f

    for (arrValue in arr)
        if (arrValue > 0)
            numberPositive++
        else if
                     (arrValue < 0) numberNegative++
        else
            numberZero++

    // show the answer -->
    println("positive numbers: ${numberPositive / arraySize}")
    println("negative numbers: " + (numberNegative / arraySize))
    println("zero numbers: ${numberZero / arraySize}")

}