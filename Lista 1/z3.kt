// zad 3 Kamil Cielica
fun main(){ 
    val dzielnik = arrayOf<Int>(3, 5, 7, 11, 13)
    val dziel_str = arrayOf<String>("trzy","piec","siedem","jedenascie","trzynascie")
    val sb = StringBuilder() 
    for(i in 1..100){
        for(j in 0..dzielnik.size - 1){
            if(i % dzielnik[j] == 0 )
                sb.append(dziel_str[j])
        }
        println(i.toString() + " : "+ sb)
        sb.clear()
    }           
}