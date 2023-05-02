object dyna_for {
  def main(args: Array[String]): Unit =
  {
    println("enter a number greater than 0, which will be the limit of series")
    var i : Int = scala.io.StdIn.readInt()
    println("you have entered : " + i)
    println("FOR LOOP output")
    for(j <- 0 to i)
    {
      println("the number is : " + j)

    }
    println("while loop output")
    var k :Int = 1
    while (k <= i){
      println("THE NUMBER IS : " + k)
      k = k + 1
    }
  }
}
