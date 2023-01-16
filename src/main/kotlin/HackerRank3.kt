/*
 Mohammad-Reza Fekri - Github: @fekri86114
 The third problem of https://www.hackerrank.com
*/
fun main(args: Array<String>) {
    /* test area */
    val aliceScore = arrayOf(100, 5, 14)
    val bobScore = arrayOf(60, 8, 4)

    println(compareTriples(aliceScore, bobScore).contentToString())
}

// answer -->
fun compareTriples(a: Array<Int>, b: Array<Int>): Array<Int> {
    // write your code here
    var alice = 0
    var bob = 0

    if (a[0] > b[0]) alice += 1 else if (a[0] < b[0]) bob += 1
    if (a[1] > b[1]) alice += 1 else if (a[1] < b[1]) bob += 1
    if (a[2] > b[2]) alice += 1 else if (a[2] < b[2]) bob += 1

    return arrayOf(alice, bob)
}
