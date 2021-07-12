//Higher Order Function
//Predicate is a function that takes an String and returns a Boolean
fun printFilteredStrings(list:List<String>,predicate: (String) -> Boolean){
    list.forEach {
        if (predicate(it)){
            println(it)
        }
    }

}

fun main(){
    val list = listOf("Kotlin","Java","Python")
    printFilteredStrings(list){
        it.startsWith("P")}
}