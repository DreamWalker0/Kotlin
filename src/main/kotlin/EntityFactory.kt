import java.util.*
import javax.swing.text.html.parser.Entity

//uses Companion Objects
//interface IdProvider{
//
//    fun getId(): String
//}

//Object declaration
//object EntityFactory{
//
//    fun create() = Entity("id","name")
//}

//Enum
enum class EntityType{
    EASY, MEDIUM, HARD
}

//object EntityFactory{
//
//    fun create(type:EntityType): Entity {
//        val id = UUID.randomUUID().toString()
//        val name = when(type){
//            EntityType.EASY -> "Easy"
//            EntityType.MEDIUM -> "Medium"
//            EntityType.HARD -> "Hard"
//        }
//        return Entity(id, name)
//    }
//
//}

class Entity(val id:String, val name:String){

//    //This is a companion object
//    companion object Factory: IdProvider{
//
//        const val id = "id"
//
//        override fun getId(): String {
//            return "123"
//        }
//
//        fun create() = Entity(getId())
//    }

    //Object Declaration
    override fun toString(): String {
        return "id:$id name:$name"
    }

}