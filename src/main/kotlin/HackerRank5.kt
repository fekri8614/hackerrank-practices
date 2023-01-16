import kotlin.math.abs

/*
 Mohammad-Reza Fekri - Github: @fekri86114
 The fifth problem of https://www.hackerrank.com
*/
fun main(args: Array<String>) {
    /* test area */              // number     1, 2, 3
// index | number                   index      0, 1, 2
    /* 0     | 1 */    val a: Array<Int> = arrayOf(1, 2, 3)
    /* 1     | 2 */    val b: Array<Int> = arrayOf(4, 5, 6)
    /* 2     | 3 */    val c: Array<Int> = arrayOf(7, 8, 9)

    //                                 0|1, 1|2, 2|3
    val f: Array<Array<Int>> = arrayOf( a ,  b , c )
    println(diagonalDifference(f))

//  arr[0][0] = 1 + arr[1][1] = 5 + arr[2][2] = 9, -> 15
//  arr[0][2] = 3 + arr[1][1] = 5 + arr[2][0] = 7, -> 15
//  15 - 15 = 0

}

// answer -->
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // write your code here
    var sum1 = 0
    var sum2 = 0
    for ( i in 0..arr.size -1 ) {
        sum1 += arr[i][i] // arr[0][0] + arr[1][1] + arr[2][2]
        sum2 += arr[i][arr.size -1 -i] // arr[0][((3-1)-0)=2] + arr[1][((3-1)-1)=1] + arr[2][((3-1)-2)=0]
    }
    return abs(sum1 - sum2)
}