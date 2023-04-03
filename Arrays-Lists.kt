fun main(args: Array<String>) {
   var fruits = arrayOf("Mango", "Apple");

    //Immutable list e.g (cannot modify)
    var fruitsList = listOf("Mango", "Apple")

    //Mutalbe e.g (Can Modify)
    var fruitsMutableList = mutableListOf<String>("Mango", "Apple");
    fruitsMutableList.add("Grapes");

}


