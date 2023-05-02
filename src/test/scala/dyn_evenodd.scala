object dyn_evenodd
{
  def main(args: Array[String]): Unit ={
    println("enter a number greater than 1; which will be the limit of series :")
    var i :Int = scala.io.StdIn.readInt()
    println("you have entered :" + i)
    println("the list of EVEN numbers")
    for (j <- 1 to i) {
      if (j % 2 == 0)
        println("THE NUMBER IS EVEN : " + j)
    }
    println("the list of ODD numbers")
    for (a <- 1 to i)
    {
      if(a % 2 != 0)
        println("THE NUMBER IS ODD : " + a)
    }
  }
}
