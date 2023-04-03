fun main(args: Array<String>) {

    //Continue
    //Print all numbers 1-10 except 7
    for (i in 1..10)
    {
        if(i == 7)
        {
            continue;
        }
        println(i)
    }

    //Break
    //Find if mango is present in fruits array
    var fruits = arrayOf("Mango", "Apple", "Grapes");
    for (fruit in fruits)
    {
        if (fruit == "Mango")
        {
            println("Found Mango");
            break;
        }
    }

    //Return
    println(addNumbers(45,23))
}

fun addNumbers(num1: Int, num2: Int): Int{
    return  num1 + num2;
}