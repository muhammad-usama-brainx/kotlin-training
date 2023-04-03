fun main(args: Array<String>) {
    greet("Usama Javed", 23);

    //With 1 Parameter
    greet("Usama Javed")
    greet(age = 23);

    //With no parameter
    greet();
}


fun greet(name: String = "Unknown", age: Int = 0){
    println("Hello $name, Your Age is $age")
}
