fun main() {
    val firstName = "Alexandr"
    val lastName = "Mikhaylovskiy"
    var height = 196.3
    var weight = 102.2f
    var isChild =
        height < 140.0 && weight < 40.0f
    var info =
        firstName + ", " +
                lastName + ", " +
                "$height" + ", " +
                "$weight" + ", " +
                "$isChild"
    println(info)
    height = 111.1
    weight = 36.9f
    isChild =
        height < 140.0 || weight < 40.0f
    info = firstName + ", " +
            lastName + ", " +
            "$height" + ", " +
            "$weight" + ", " +
            "$isChild"
    println(info)


}
