fun main() {
    println("Enter Fibo number")
    val n = readLine()?.toIntOrNull() ?: return
    fibloop(n)
}

fun fibloop(n: Int): Int {
    var firstnum = -1
    var secondnum = 1
    var i =0
    var fibonachi: Int

    while (i<n-2){
    fibonachi=firstnum+secondnum
        firstnum=secondnum
        secondnum=fibonachi
        i++
        println("Значение: $secondnum" )
    }
    return secondnum
}