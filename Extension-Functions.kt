fun main(args: Array<String>) {
  var p1 = Person("Muhammad Usama Javed", 24);

    println(p1.ageAfterFiveYears());

}

fun Person.ageAfterFiveYears(): Int {
    return  this.age + 5;
}


class Person(var name: String = "Unknown", var age: Int = 0){

    fun introduce()
    {
        println("Hello My Name is $name and my Age is $age");
    }
}