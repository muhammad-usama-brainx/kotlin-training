fun main(args: Array<String>) {
   var p1:Person = Person().apply {
       name = "Muhammad Usama Javed"
       age = 24;
   };

    var p2:Person? = null;

    p2?.run {
        println(name)
    }

   var ageAfterFiveYears =  with(p1) {
       age + 5;
    }
    println("Age after 5 years will be $ageAfterFiveYears")

    p1.also {
        it.name = "Usama Javed"
    }
    p1.introduce();

    var name:String? = null
   var length =  name?.let {
        println(it)
       it.length
    }
    println(length)
}


class Person(var name: String = "Unknown", var age: Int = 0){

    fun introduce()
    {
        println("Hello My Name is $name and my Age is $age");
    }
}