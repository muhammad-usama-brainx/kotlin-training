fun main(args: Array<String>) {
    var p1 = Person();
    p1.introduce();

    var p2 = Person("Usama Javed")
    p2.introduce();
}


//Default Constructor
class Person(name: String)
{
    val name:String;
    init {
        this.name = name;
    }

    constructor(): this("Unknown"){
        println("This is secondary constructor")
    }

    fun  introduce() {
        println("Hello ${this.name}")
    }
}