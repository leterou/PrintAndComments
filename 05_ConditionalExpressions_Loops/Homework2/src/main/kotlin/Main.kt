fun main() {
    println("Enter Fibo number")
    val n = readLine()?.toIntOrNull() ?: return
    fibloop(n)
}
fun fibloop(n: Int): Int {
    var firstnum = 1
    var secondnum = 0
    var i =0
    var fibonachi: Int

    while (i<=n-1){
    fibonachi=firstnum+secondnum
        firstnum=secondnum
        secondnum=fibonachi
        i++
        println("Значение $i: $secondnum" )
    }
    return secondnum
}