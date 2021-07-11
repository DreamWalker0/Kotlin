import kotlin.random.Random

class Circle(
    val radius: Double
) : Shape("Circle"){

    //Uses Companion Object
    companion object{
        fun randomCircle(): Circle{
            //returns random number form 1 to 10
            val radius = Random.nextDouble(1.0,10.0)
            return Circle(radius)
        }
    }
    init {
        println("$name created with radius = $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    //This uses the companion object  ImportantNumbers with property PI
    override fun area() = radius * radius * ImportantNumbers.PI
    override fun perimeter() =2 * radius * ImportantNumbers.PI
}