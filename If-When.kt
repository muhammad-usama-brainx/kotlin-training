fun main(args: Array<String>) {
   var age = 17;
    var isAdult: Boolean;

    if(age > 18)
    {
        println("You are Adult")
    }
    else
    {
        println("You are Child")
    }


    when(age)
    {

        in 1..18 -> println("You are Child")
        in 18..Int.MAX_VALUE -> println("You are Adult")
        else -> "I dont know";
    }

}

