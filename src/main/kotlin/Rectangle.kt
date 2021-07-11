class Rectangle (
    val a: Double,
    val b:Double
        ){
    init {
        println("Rectangle with  height a = $a and base b = $b")
    }

    //area of rectangle
    fun area() = a * b

    //perimeter of rectangle
    fun perimeter() = 2 * a + 2 * b
}