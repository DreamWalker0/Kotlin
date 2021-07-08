//todo 17. Higher Order Function
//Predicate is a function that takes an String and returns a Boolean
fun printfilteredStrings(list:List<String>,predicate: (String) -> Boolean){
    list.forEach {
        if (predicate(it)){
            println(it)
        }
    }

}

fun main(){
    val list = listOf("Kotlin","Java","Python")
    printfilteredStrings(list){
        it.startsWith("P")}
}