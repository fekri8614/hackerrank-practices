/*
 Mohammad-Reza Fekri - Github: @fekri86114
 The seventh problem of https://www.hackerrank.com
*/
fun main(args: Array<String>) {
    /* test area */
    stairCase(16)
}

// answer -->
fun stairCase(n: Int): Unit {
    // Write your code here
    for (i in 1..n) { // main for loop
        for (i1 in 1..n -i) { // second for loop
            print(" ")
        }
        for (i2 in 1..i) { // third for loop
            print("#")
        }
        println()
    }
}