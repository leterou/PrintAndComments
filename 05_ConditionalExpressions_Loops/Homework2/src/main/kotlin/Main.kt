fun main() {
    println("Enter Fibo number")
    val go = readLine()?.toIntOrNull() ?: return
    fibloop(go)
}

fun fibloop(n: Int): Int {
    var firstnum = 0
    var secondnum = 1
    var fibonachi = 0
    if (n <= 1) return 0
    if (n == 2) return 1

    for (j in 3..n) {

        fibonachi = firstnum + secondnum
        firstnum = secondnum
        secondnum = fibonachi

        if (j == n) {
            return fibonachi
        }
        println("$fibonachi")
    }

    return fibonachi

}