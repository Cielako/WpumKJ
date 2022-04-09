fun main() {
    val lambdaFun: (s: String, i: Int) -> String ={ str, int -> str.repeat(int) }
    val test = lambdaFun("a", 3)
    println(test)
}