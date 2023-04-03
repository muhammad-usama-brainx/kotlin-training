

fun main(args: Array<String>) {
    var c1 = Cat();
    c1.walk();
}

interface Walk{
    fun  walk() {
        println("Walking..")
    }
}

open class Animal{
   fun speak()
    {
        println("Speaking...")
    }
}

class Cat: Animal(), Walk {

}