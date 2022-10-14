
fun main (){
    val text =""""F2p)v"y233{0->c}ttelciFc"""
    val text1:String= text.substring(0,12)
    val text2:String= text.substring(12,24)
    println(decor2(text2) + decor1(text1))

}

fun decor1(text:String) {
    val first = text.map { char -> char + 1 }.joinToString("")
    val second = first.replace("5", "s")
    val third = second.replace("4", "u")
    val four = third.map { char -> char - 3 }.joinToString("")
    val five = four.replace("0", "o")
}
fun decor2(text2: String):String{
    val textrev=text2.reversed()
    val shiftString=textrev.map {char->char -4}.joinToString ("")
    val str=shiftString.replace('_',' ')
    return str
}

