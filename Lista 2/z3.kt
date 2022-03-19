fun main (){
    fun isCyclic (i: Int): Boolean {
        var s = i.toString()
        var tempNum = s.toBigInteger()
        var len  = (s.length).toInt() + 1
        var str = len.toString()
        var len1 = str.toBigInteger()
        var buffer = StringBuilder()
        for(it in 1..(len - 1)){
            buffer.append("9")
        }
        var buffernum = buffer.toString().toBigInteger()
        if(tempNum.multiply(len1).equals(buffernum)){
            println("Liczba " + s + " jest cykliczna")
            return true
        }
        else{
            println("Liczba " + s + " nie jest cykliczna")
            return false
        }
    }

    println(isCyclic(230769))
    println(isCyclic(142857))
}