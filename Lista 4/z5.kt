fun log2(i: Int): Int{
    fun log2(i: Int): Int{
        return (kotlin.math.log2(i.toDouble()).toInt())
    }
    return log2(i)
}

fun fib(n: Int): Int{
    tailrec fun fib(n: Int, a: Int = 0, b:Int = 1): Int { 
        if(n == 0) return b
        return  fib(n-1, b, a+b) 
    }
    // Obliczamy wynik za pomocą funkcji zagnieżdżonej
    return(fib(n-1))
}

fun format()

fun main(){

}
