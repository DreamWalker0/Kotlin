interface PersonInfoProvider {
    val providerInfo: String

    fun printInfo(person: Person){
        println(providerInfo)
        person.printInfo()
    }

}

//Multiple interfaces can be implemented
interface SessionInfoProvider{
    fun getSessionId(): String
}

open class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider{
    override val providerInfo: String
        get() = "BasicInfoProvider"

    //Add open so it can be used in other places and override
    //Protected makes it available to child class but not to public
    protected open val sessionIdPrefix = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }

}

//Type casting
//fun checkTypes(infoProvider: PersonInfoProvider){
//    if (infoProvider is SessionInfoProvider) {
//        println("Is a session info provider")
//    }else{
//        println("Not a session info provider")
//    }
//}
//For negating you can use !is
fun checkTypes(infoProvider: PersonInfoProvider){
    if (infoProvider !is SessionInfoProvider) {
        println("Not a session info provider")
    }else{
        println("Is a session info provider")
        //Casting
//        (infoProvider as SessionInfoProvider).getSessionId()
        //Smart Cast: cast automatically
        infoProvider.getSessionId()

    }
}
