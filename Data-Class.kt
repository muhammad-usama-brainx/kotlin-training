fun main(args: Array<String>) {
    var p1 = Person("Usama Javed", 24);
    var p2 = Person("Usama Javed", 24);

    if(p1 == p2)
    {
        println("Equals")
    }

}

data class Person(var name:String,var age: Int){

}