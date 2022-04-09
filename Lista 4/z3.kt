fun fib1(n: Int): Int =
    when(n){
        0,1 -> n
        else -> fib1(n-1) + fib1(n-2)
    }

fun fib2(n: Int): Int {
   return if(n == 0 || n == 1) n else fib2(n-1) + fib2(n-2)
}


/*  tailrec można użyć tylko wtedy, gdy ostatnia 
    linijka wywołuje tą samą funkcję i dalej nie ma żadnego kodu
*/ 
fun fib(n: Int): Int{
    tailrec fun fib(n: Int, a: Int = 0, b:Int = 1): Int { 
        if(n == 0) return b
        return  fib(n-1, b, a+b) 
    }
    // Obliczamy wynik za pomocą funkcji zagnieżdżonej
    return(fib(n-1))
}






fun main() {
    println("Bez tailrec: " + fib2(6))

    println("z tailrec: " + fib(6))
}