object even_odd {
  def main(args: Array[String]): Unit = {
    println("the output of even odd logic")
   for(i <- 1 to 100)
   {
     if(i%2 == 0)
       {
         println(i + " is an even Number")
       }
     else
       {
         println(i + " is an odd Number")
       }


   }
  }

}
