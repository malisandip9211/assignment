

object input_fromCLI {
  def main(args: Array[String]): Unit = {
    println("accept the input from command line interface")
    print("Enter your  name: ")
    val name: String = scala.io.StdIn.readLine()
    println("You Have Entered : " + name)
  }

}
