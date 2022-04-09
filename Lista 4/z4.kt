fun log2(i: Int): Int{
    fun log2(i: Int): Int{
        return (kotlin.math.log2(i.toDouble()).toInt())
    }
    return log2(i)
}


fun main() {
    println(log2(4))
}