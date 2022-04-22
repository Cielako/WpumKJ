fun suma(a: Array<Int>): Int = (a.filter { it > 0 }).reduce { res, it -> res + it }

fun main(){
   println(suma(arrayOf(1,-4,12,0,-3,29,-150)))
}