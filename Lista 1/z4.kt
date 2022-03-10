// zad 4 Kamil Cielica

fun missingNumber(vararg input: Int) : Int
{
    var result = 0;
    var tab_it = 0;
    for(i in 1..input.size)
    {
        result += i
        result -= input[tab_it]
        tab_it += 1
    }
    return result
}

fun main(){ 
    val array = intArrayOf(2,4,5,3,6,0,1) 
    println("Brakujaca liczba to: " + missingNumber(*array).toString())
}