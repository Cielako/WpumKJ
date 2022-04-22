fun countElements (arr: Array<Array<Char>>): Map<Char, Int>{
   val mapOfElements = mutableMapOf<Char, Int>()
   arr.flatten().forEach(){
      when(val count = mapOfElements[it]){
         null -> mapOfElements[it] = 1
         else -> mapOfElements[it] = count + 1
      }
   }
   return mapOfElements
}
fun main(){
   println(countElements(arrayOf(arrayOf('a','b','c'), arrayOf('c','d','f'), arrayOf('d','f','g'))))
}