val <T> List <T>.tail: List<T>
        get() = drop (1) // Usuwamy pierwszy element

val <T> List <T>.head: T
    get() = first() // Bierzemy tylko pierwszy element

fun main(){
    val list = listOf("2","3","4")
    println("Ogon Listy: " + list.tail)
    println("Głowa Listy: " + list.head)
}
