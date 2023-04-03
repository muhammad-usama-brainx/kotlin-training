fun main(args: Array<String>) {
   var c1 = Cat();
    c1.speak();
}

open class Animal{
    fun  speak()
    {
        println("Speaking...")
    }
}

class Cat : Animal(){

}