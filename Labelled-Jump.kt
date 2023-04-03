fun main(args: Array<String>) {
    //Labelled Jump
    //Dont wanna print 2 series after 2-2

outer@  for(i in 1..5)
        {
            for (j in 1..5)
            {
                println("$i $j")
                if(i == 2 && j ==2)
                    continue@outer
            }
        }
}

