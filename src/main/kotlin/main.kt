//#Author: Jorge Guzman Nader
//#Date: 7/7/2021
//#Info: Kotlin Tutorial

import java.lang.Math.abs

//todo 0. Functions
//Function Structure
fun myFun(): String {
    return "This is a function"
}

//Single expression function
fun singleExpression(): String = "This is a single expression function"
fun singleExpressionSimple()= "This is an even simpler single expression function"

//Function parameters
fun sayHello(person:String){
//    val message = "Hello " + person
    //Using string template with $ sign
    val message = "Hello $person"
    println(message)
}
//Even shorter function
fun sayHelloShort(greeting:String,person: String) = println("$greeting $person")

//Using Lists in functions
fun sayHelloList(greeting: String, items:List<String>){
    items.forEach { items ->
        println("$greeting $items")
    }
}
//vararg Function
fun sayHelloVararg(greeting: String, vararg items:String){
    items.forEach { items ->
        println("$greeting $items")
    }
}
//Experiment
//fun sayHelloList(greeting: List<String>, items:List<String>){
//    items.forEach { items ->
//        println("$greeting $items")
//    }
//}

//power function with no return
fun toThePower(base: Int, exp: Int) {
    var result = 1
    for (i in 1..exp){
        result *= base
    }
    println("$base to power of $exp is: $result")
}
//power function with return type
//Needed so we can assign the function to a variable
fun toThePowerReturn(base: Int, exp: Int): Int {
    var result = 1
    for (i in 1..exp){
        result *= base
    }
    return  result
}

//A1: test Higher Order function
fun operation(): (Int) -> Int {
    return ::square
}
//Square function
fun square(x: Int) = x * x

//Extension functions
//These extend the ability of functions to do stuff
//ex.a prime number finder using Ints
fun Int.isPrime(): Boolean{
    for ( i in 2 until this -1){
        if (this % i == 0){
            return false
        }
    }
    return true
}



fun main(args: Array<String>) {

    //todo 1. val: Non-mutable variable, read only
//    val name: String = "Dog"
//
       //todo 2. var: Mutable variable: Can be reassign
//    var name2: String = "Cat"
//    name2 = "Dog"
//
//    println(name + " an d "+ name2)

    //println will use just one data type, int, bool, float
    //println( 17.0 / 7.0)

    //you can also print the whole expression result
//    var xs = 10
//    var ys = 2
//    println("The result of xs * ys is: ${xs * ys} ")

//
      //todo 3. Null Safety
//    //You can make a variable null by adding ?
//    var laws: String? = null
//    println(laws)

    //todo 4. Data Types
    //variable type is auto-detected
//    var num = 5
//    var word = "hello"
//    var decimal = 2.33
//    var bool = true
////    println(bool)
//    var nada: String? = null

//    if ( nada == null) {
//        println(nada)
//    }

    /*todo 5. When
    *When statement is like Switch in Java
    *When nada is null print "is null
    *Else print "Is not null"
    */
//    when(nada){
//        null -> println("Is null")
//        else -> println("Is not null")
//    }

//    var z = 5
//    when{
//        z % 2 == 0 -> println("Is even")
//        z % 2 != 0 -> println("Is odd")
//    }

    //todo 6. If, Else
    //Assign variable value using if statement
//    var a = 5
//    var b = 10
//    val result = if (b>a) b else "a is greater"
    //println(result)

    //sayHelloShort("Hola", "Mulu")

    /*
    *COLLECTIONS AND ITERATIONS
     */

    //todo 7. Arrays, For Loops
    //Can infer the type of the array eg.int, strings
//    val myArray = arrayOf("A","B","C ")
//    println(stringArr.size)
//    println(stringArr[2])

    //For loop
//    for (myArray in myArray){
//        println(myArray)
//    }

//    for (i in 10 downTo 1 step 2){
//        println(i)
//    }

//    for ( i in 'z' downTo 'a'){
//        println(i)
//    }

    //it is default name of the array i this lambda function
    //Bad thing this loses the index data
//    myArray.forEach {
//        println(it)
//    }
//    myArray.forEach {myArray->
//        println(myArray)
//    }

    //this fix the index issue
//    myArray.forEachIndexed { index, myArray ->
//        println("$myArray is at index $index")
//    }

    //todo 8.Lists
    //Lists are immutable
//    val myList = listOf("Alpha","Beta","Gamma")
//    //println(myList[1])
//
//    myList.forEachIndexed { index, myList ->
//        println("$myList is at index $index")
//    }

    //You can make a list mutable by using this
    val myList = mutableListOf("Alpha","Beta","Gamma")
    val myGreetings = listOf("Hola", "Bonjour", "Ola")

//    myList.add("Omega")

    //Remove specific element
//    myList.remove("Alpha")
//    println(myList)

    //Remove at an index
//    println(myList.removeAt(2))
//    println(myList)

//    myList.forEachIndexed { index, myList ->
//        println("$myList index is $index")
//    }
    //Function call
    //sayHelloList("Bonjour", myList)

    //Reverse order list
    //The myList2.size - 1 is to start the index at 2 because the size of the list is 3
//    var myList2 = mutableListOf<Int>(1,2,3)
//    for (i in myList2.size - 1 downTo  0){
//        println(myList2[i])
//    }


    //todo 9. Map
//    val myMap = mapOf(1 to "A", 2 to "B", 3 to "C")
//    myMap.forEach { key, value -> println("$key is the key of $value") }
    //Mutable map
//    val myMap = mutableMapOf(1 to "A", 2 to "B", 3 to "C")
//    myMap.put(4, "D")
//    myMap.forEach { key, value -> println("$key is the key of $value") }

    //todo 10. vararg
    //vararg = variable number of arguments
//    fun sayHelloList(greeting: String, vararg items:List<String>){
//        items.forEach { items ->
//            println("$greeting $items")
//        }
//    }
    //Because the vararg you can pass the arguments with no limit inside the fucntion call
//    sayHelloVararg("Hola", "Mol","Mel","Mil")

    //We can insert arrays using the spray operator: "*" in front the array
//    var myArray = arrayOf("Pepe", "Alba", "Lulu")
//    sayHelloVararg("Hola", *myArray)

    //Changing the order of parameters does not change the parameters
    //we can skip specifying arguments if we have default ones in the function
    fun greetPerson(greeting: String = "Hello",name:String = "Human") = println("$greeting $name")
//    greetPerson(greeting = "Salut")

    //Add multiple words to elements of an array using items = *fancyArray
//    val fancyArray = arrayOf("Alba","Balto","Cook ")
    //sayHelloVararg(greeting = "Hola", items = *fancyArray)

    //todo 11. Classes

    //Instance of a class:Constructor
//    val person = Person()
//    person.lastname
//    person.firstName
//    //A var assigned inside the class: Person now can be mutable form the outside
//    person.nickName = "The Eye"
//    person.nickName = "The New Eye"
//    println(person.nickName)
//    person.printInfo()

    //Calls rectangle class
//    val myRectangle = Rectangle(5.0,5.0)
//    println("Rectangle area is ${myRectangle.area()}")
//    println("Rectangle perimeter is ${myRectangle.perimeter()}")

    //todo 12. Interfaces
    //Uses PersonInfoProvider
//    val provider = FancyInfoProvider()
//    provider.printInfo(Person())
//    //Call SessionId
//    provider.getSessionId()
//    checkTypes(provider)


    //todo 14. Object Expression
//    val provider = object : PersonInfoProvider {
//        override val providerInfo: String
//            get() = "New info provider"
//        fun getSessionId() = "id"
//    }

//    provider.printInfo(Person())
//    //Call SessionId
//    provider.getSessionId()
//    checkTypes(provider)

    //Using companion class
//    val entity = Entity.Factory.create()
//    Entity.id

    //Using Object declarations
//    val entity = EntityFactory.create(EntityType.EASY)
//    println(entity)
//
//    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
//    println(mediumEntity)

    //Some loop
    val cakes = listOf("Cherry","Chocolate","Piña")
    for (cake in cakes){
//        println("This is a $cake cake")
    }

    //Some comparison
    fun lessThan(a:Int, b:Int) = if (a<b) println("$a is smaller than $b") else if (b<a) println("$b is smaller than $a")
    else println("$b is equal to $a")

//    println(lessThan(10,10))


    //patters in regex
    //This get the pattern 13 JUN 1992, 2 digits, space, month, space, 4 digits
    val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

    fun getPattern(): String = """\d{2} $month \d{4}"""



    ////A1: test Higher Order function
    val func = operation()
    var x = 5
//    println("The square of $x is " + func(x))

    //todo 19. Filters
    val numbs = listOf(-1,-3,5,7,-10,-3,0)
    val positive = numbs.filter { it > 0 }
    val negative = numbs.filter { it < 0 }
//    println("list of positive numbers " + positive)
//    println("list of negative numbers " + negative)

    //todo 20. map
    //map extension function enables you to apply a transformation to all elements in a collection.
    //It takes a transformer function as a lambda-parameter.
    val doubleNum = numbs.map{it * 2}
//    println("doubled numbers are " + doubleNum)

    //todo 21. any, all , none
    //If any element matches then that element is returned
    val anyNegative = numbs.any{it < 0}
    val greaterThan11 = numbs.any { it > 21 }
//    println("Is there any number less then zero? " + anyNegative)
//    println("Is there any number bigger than 21? " + greaterThan11)

    //all returns true if all numbers match the parameter
    val allEven = numbs.all { it % 2 == 0 }
    val allLess11 = numbs.all { it < 11 }
//    println("Are all numbers even ? " + allEven)
//    println("Area all numbers less than 11 ? " + allLess11)

    //none returns true if there are no elements that match the given predicate in the collection.
    val noneEven = numbs.none { it % 2 == 0 }
    val noneMoreThan11 = numbs.none { it > 11 }
//    println("None numbers are even? " + noneEven)
//    println("None numbers are more than 11 " + noneMoreThan11)

    //todo 22. find, findLast
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")
    val firstWord = words.find { it.startsWith("some") }
    val lastWord = words.findLast { it.startsWith("some") }
    val nothingWord = words.find { it.contains("nothing") }
//    println("The first word that starts with \"some\" is " + firstWord)
//    println("The last word that starts with \"some\" is " + lastWord)
//    println("The first word containing \"nothing\" is " + nothingWord)
//
    //todo 23. first, last
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val first = numbers.first()
    val last = numbers.last()
    val firstEven = numbers.first { it % 2 == 0 }
    val lastOdd = numbers.last { it % 2 != 0 }
//    println("Fist is $first, last is $last, first even is $firstEven, last odd is $lastOdd")

    //todo 24. count
    val totalCount = numbers.count()
    val evenCount = numbers.count { it % 2 ==0 }


    //todo 25. associateBy, groupBy
    /*
    *Functions associateBy and groupBy build maps from the elements of a collection indexed by the specified key.
    * The key is defined in the keySelector parameter.
    * You can also specify an optional valueSelector to define what will be stored in the value of the map element.
     */
    data class Person(val name: String, val city: String, val phone: String)

    val people = listOf(
        Person("John", "Boston", "+1-888-123456"),
        Person("Sarah", "Munich", "+49-777-789123"),
        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456"))

    val phoneBook = people.associateBy { it.phone }
    val cityBook = people.associateBy(Person::phone, Person::city)
    val peopleCities = people.groupBy(Person::city, Person::name)
    val lastPersonCity = people.associateBy(Person::city, Person::name)

    //todo 26. partition
    //Divides groups by specified parameters
    val (even, Odd) = numbers.partition { it % 2 == 0 }
    val (positives, negatives) = numbers.partition { it > 0}
//    println("even $even, odd $Odd")
//    println("positive $positives, negatives $negatives")

    //todo 27. flatmap
    //makes a list form many lists
    val fruitsBag = listOf("apple","orange","banana","grapes")
    val clothesBag = listOf("shirts","pants","jeans")
    val cart = listOf(fruitsBag, clothesBag)
    val mapBag = cart.map { it }
    val flatMapBag = cart.flatMap { it }
//    println("map: $mapBag")
//    println("flatmap: $flatMapBag")

    //todo 28. sorted
    val shuffled = listOf(5, 4, 2, 1, 3, -10)
    val natural = shuffled.sorted()
    val inverted = shuffled.sortedBy { -it }
    val descending = shuffled.sortedDescending()
    val descendingBy = shuffled.sortedByDescending { abs(it)  }

    //todo 29. zip
    //merges 2 collections into one, just like doing dot product
    val A = listOf("a", "b", "c")
    val B = listOf(1, 2, 3, 4)

    val resultPairs = A zip B
    val resultReduce = A.zip(B) { a, b -> "$a$b" }

//    println("A to B $resultPairs")
//    println("A to B shorthand $resultReduce")

    //todo 30. getOrElse
    //Gets an element or else prints a default value
    val list = listOf(0, 10, 20)
//    println(list.getOrElse(1) { 42 })
//    println(list.getOrElse(10) { 42 })

    //todo 31. Named Arguments
    //Calls a function with named arguments.
    //When invoking a function with named arguments, you can specify them in any order you like.
    fun format(userName1: String  = "Momo", domain1:String = "Log.com")= println("$userName1: $domain1")
//    format(domain1 = "bar.com", userName1 = "foo")

    //todo 32. String Template
    val greeting = "Human"
    // 1.Prints a string with a variable reference. References in strings start with $.
    // 2.Prints a string with an expression. Expressions start with $ and are enclosed in curly braces.
//    println("Hello $greeting")                 // 1
//    println("Hello ${greeting.uppercase()}")  // 2

    //todo 33. Destructuring Declarations
    //Destructures an Array. The number of variables on the left side matches the number of arguments on the right side.
    //Maps can be destructured as well. name and age variables are mapped to the map key and value.
    //Built-in Pair and Triple types support destructuring too, even as return values from functions.
//    val (x1, y1, z1) = arrayOf(5, 10, 15)                              // 1
//
//    val map = mapOf("Alice" to 21, "Bob" to 25)
//    for ((name, age) in map) {                                      // 2
//        println("$name is $age years old")
//    }
//
//    val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83))    // 3

    //todo 34. User Input
    val listUser = mutableListOf<Int>()
//    val userInput = readLine()
//    println("You entered: $userInput")
//    //You can also modify the input but must add ? to indicate in case of null (no input)
//    println(userInput?.uppercase())
//    //Using arithmetic operators
//    if (userInput != null) {
//        println("your result is ${userInput.toInt() - 5}")
//    }

    //This can just be done with mutableList and not arrays
//    for(i in 1..10){
//        val userInput1 = readLine()?.toInt()
//        //check if it is not null
//        if (userInput1 != null){
//            listUser.add(userInput1)
//        }
//    }
//    println(listUser)

    //Average
//    println("Enter 3 numbers")
//    var avg = 0.0
//    for (i in 1..3){
//        val input = readLine()?.toDouble()
//        if (input != null){
//            avg += input /3
//        }
//    }
//    println(avg)

    //Using the return function
//    val pow = toThePowerReturn(2,2)
//    println(3 * pow)

    //Testing Extension Function
//    println("Enter a number, please")
//    var input = readLine()?.toInt()
//    if (input != null){
//        if (input.isPrime()) {
//            println("$input is a prime number")
//        }else{
//            println("$input is not a prime")
//        }
//    }



}





