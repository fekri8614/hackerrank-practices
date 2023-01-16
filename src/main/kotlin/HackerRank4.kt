/*
 Mohammad-Reza Fekri - Github: @fekri86114
 The fourth problem of https://www.hackerrank.com
*/
fun main(args: Array<String>) {
    /* test area */
    val bigNumbers = arrayOf<Long>(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)
    println(aVeryBigSum(bigNumbers))
}

// answer -->
fun aVeryBigSum(ar: Array<Long>): Long {
    // write your code here
    var sum = 0L
    ar.forEach {
        sum += it
    }
    return sum
}