fun main(args: Array<String>) {
   var c1 = Cat();
    c1.speak();


    //Overloading Funtion
    greet();
    greet("Usama Javed")
}


open class Animal{
   open fun  speak()
    {
        println("Speaking...")
    }
}

class Cat : Animal(){

    //Overriding
    override fun speak() {
       println("Meow...")
    }
}


fun greet() {
    println("Hello, How are you?")
}

fun  greet(name: String){
    println("Hello $name, How are you?")
}