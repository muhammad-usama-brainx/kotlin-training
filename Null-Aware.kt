fun main(args: Array<String>) {
   var name: String? = "Usama";

    //Safe Call
    //Will return null if value is null
    println("Hi your name length is ${name?.length}")

    //Safe let
    //Will only run if name is not null
    name?.let {
        println("Your name length is ${name.length}")
    }

    //Elvis
    //If name is not null, left side of operator will be assigned to length otherwise right
    var length:Int = name?.length ?: -1;
    println(length)

    //!! Not nul asserted
    //Will throw null pointer exception ifvalue is null
    //Use only if 100% sure value is not null
    println(name!!.length)

}


