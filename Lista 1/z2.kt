//zad 2 Kamil Cielica
fun main(){ 
    for(i in 1..100)
        if(i % 3 == 0 && i % 5 == 0 && i % 7 == 0 )
            println(i.toString()+ ":" +"trzypiecsiedem")
        else
            if(i % 3 == 0 && i % 5 == 0 )
            println(i.toString()+ ":" +"trzypiec")
            else if(i % 3 == 0 && i % 7 == 0 )
                println(i.toString()+ ":" +"trzysiedem")
            else if(i % 5 == 0 && i % 7 == 0 )
                println(i.toString()+ ":" +"piecsiedem")    
            else
                if(i % 3 == 0)
                    println(i.toString()+ ":" +"trzy")
                else if(i % 5 == 0)
                    println(i.toString()+ ":" +"piec")
                else if(i % 7 == 0)
                    println(i.toString()+ ":" +"siedem")
                else
                    println(i)
}