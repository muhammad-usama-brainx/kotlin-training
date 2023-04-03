import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

fun main(args: Array<String>) {
    var p1 = Person("Usama Javed", 23);

    var jsonPerson = Json.encodeToString(p1);
    println(jsonPerson)


    var person = Json.decodeFromString<Person>(jsonPerson);
    print(person)
}

@Serializable
data class Person(var name:String, var age:Int);