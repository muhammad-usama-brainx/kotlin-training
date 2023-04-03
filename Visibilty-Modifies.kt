fun main(args: Array<String>) {
   var c1 = Cat("Siri", 2);
    //Cannot access c1.name as it is private
    //Cannot access c1.age as it is protected and will be available only in class hierarchy
    c1.speak();
    //Can Access c1.Speak() as it is public
}


open class Animal{
   open fun  speak()
    {
        println("Speaking...")
    }
}

class Cat(name: String, age: Int) : Animal(){
    private var name:String;
    protected var age:Int;

    init {
        this.name = name;
        this.age = age;
    }
    //Overriding
    override fun speak() {
       println("Meow...")
    }
}