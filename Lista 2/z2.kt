fun main (){
    fun romanToInt(s: String): Int {
        
        var re = Regex("M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})") // należało skorzystać z wyrażenia regularnego
        if(!s.isEmpty() && s.matches(re)){
            var sum = 0
            val map = HashMap<Char, Int>()
            map['I'] = 1
            map['V'] = 5
            map['X'] = 10
            map['L'] = 50
            map['C'] = 100
            map['D'] = 500
            map['M'] = 1000
            var prev = 0
            for (i in s.length - 1 downTo 0) {
                val curr = map[s[i]]
                sum += curr!! * (if (curr < prev) -1 else 1)
                prev = curr
            }
            return sum
        }
        else{
            println("Podana Liczba rzymska nie jest poprawna")
            return 0
        }
       
    }
    println("Otrzymana liczba naturalna to: " + romanToInt("XXXX"))
}
