//Used for Inheritance
//Open makes it being able to be inherited
//protected makes the variable just accessible from the super class and all the classes that inherit them
//ex. protected var name: String
abstract class Shape (var name: String){
    init {
        println("This is the Shape super Class")
    }
    fun changeName(newName: String){
        name = newName
    }

    abstract fun area(): Double

    abstract fun perimeter(): Double
}

