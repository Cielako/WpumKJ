fun main() {
    // lambda bez it
    val f1: (String) -> String = { s:String -> s + "!"}
    
    // lambda z it
    val f2: (String) -> String = { it + "!"}
    println(f2("st"))
}