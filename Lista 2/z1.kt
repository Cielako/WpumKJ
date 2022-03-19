fun main (){
    fun convertToRoman (n: Int): String {
        val map = mapOf(1000 to "M", 900 to "CM", 500 to "D", 400 to "CD", 100 to "C", 90 to "XC", 50 to "L", 40  to "XL", 10 to "X", 9 to "IX", 5 to "V", 4 to "IV", 1 to "I")
        var num = n;
        var roman_num = StringBuilder()
        while (num > 0){
            for ((key, value) in map) { 
                if(num / key > 0){
                    for(i in 1..Math.floor(num.toDouble() / key.toDouble()).toInt()){
                        println("Liczba:" + num.toString())
                        num -= key
                        println("po odjeciu:"+ num.toString()) 
                        roman_num.append(value)
                    }
                }
            }
        }
        return roman_num.toString()
    }
    println(convertToRoman(2843))
}