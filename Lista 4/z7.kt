private val <T> List<T>.tail: List<T>
   get() = drop(1)

private val <T> List<T>.head: T
   get() = first()

fun <A> isSorted(aa: List<A>, order: (A, A) -> Boolean): Boolean {
   tailrec fun loop(a: A, remainder: List<A>): Boolean =
      when {
         remainder.isEmpty()         -> true
         !order(a, remainder.head)   -> false
         else                        -> loop(remainder.head, remainder.tail)
      }

   return aa.isEmpty() || loop(aa.head, aa.tail)
}
fun main(){
   println(isSorted(listOf(1,2,4,3),{i: Int, j: Int -> i < j}))
}