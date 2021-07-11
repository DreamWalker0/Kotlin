class Rectangle (
    //Primary Constructor
    val a: Double,
    val b:Double
    //This part ":Shape" allows the inheritance
        ): Shape("Rectangle"){

    //Secondary Constructor
    //Is optional
    //This creates an square
    //Secondary constructors just have unique parameters
    constructor(a:Double): this(a,a)

    init {
        //$name is inherited form the Shape super class
        println("$name with  height a = $a and base b = $b")
    }

    //The override if that the abstract class works

    //area of rectangle
    override fun area() = a * b

    //perimeter of rectangle
    override fun perimeter() = 2 * a + 2 * b
}