fun main(args: Array<String>) {
    var c1= Cat();
    c1.speak();
}

abstract class Animal{
    abstract fun speak();
}


class Cat: Animal() {
    override fun speak() {
        println("Meow..")
    }
}

