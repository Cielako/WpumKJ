fun main (){
    fun isCyclic (i: String): Boolean { // Poprawiono przyjmowany typ 
        var tempNum = i.toBigInteger()
        var len  = (i.length).toInt() + 1
        var str = len.toString()
        var len1 = str.toBigInteger()
        var buffer = StringBuilder()
        for(it in 1..(len - 1)){
            buffer.append("9")
        }
        var buffernum = buffer.toString().toBigInteger()
        if(tempNum.multiply(len1).equals(buffernum)){
            println("Liczba " + i + " jest cykliczna")
            return true
        }
        else{
            println("Liczba " + i + " nie jest cykliczna")
            return false
        }
    }

    println(isCyclic("230769"))
    println(isCyclic("142857"))
}