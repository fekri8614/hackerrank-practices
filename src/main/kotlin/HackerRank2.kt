/*
 Mohammad-Reza Fekri - Github: @fekri86114
 The second problem of https://www.hackerrank.com
*/
fun main(args: Array<String>) {
    /* test area */
    val sample = arrayOf(1,2,3,4,5,6)
    print(simpleArrayList(sample))
}

// answer -->
fun simpleArrayList(ar: Array<Int>): Int {
    // write your code here
    var sum = 0
    ar.forEach { member ->
        sum += member
    }
    return sum
}
