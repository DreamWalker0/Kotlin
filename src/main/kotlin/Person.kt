class Person (val firstName:String = "Abel",val lastname:String = "Aura"){

    //Can be assigned from outside the class
    var nickName: String? = null
        //Overriding setter
        set(value) {
            field = value
            println("The new nickname is $value")
        }

        //Overriding getter
        get() {
            println("The return value is $field")
            return field
        }

    //Create a function
    fun printInfo(){
//        val nickNameToPrint = if (nickName != null) nickName else "No nickname"
        //Shorter version of the above declaration using the "Elvis operator"
        /*todo 11.1 Elvis Operator ?:
        *If the expression to the left of ?: is not null, the elvis operator returns it,
        * otherwise it returns the expression to the right.
        * Note that the right-hand side expression is evaluated only if the left-hand side is null.
         */
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName ($nickNameToPrint) $lastname")
    }


//    init {
//        println("init 1")
//    }
//    //Secondary constructor
//    constructor(): this("Haul","Metal"){
//        println("secondary constructor")
//    }
//
//    init {
//        println("init 2")
//    }

    //This is not necessary
//    val firstName:String = _firstName
//    val lastname:String = _lastname

    //This is an old way to initialize values
//    init {
//        firstName = _firstName
//        lastname = _lastname
//    }
}