package codeforces._1_Watermelon

object Solution{
  import scala.io.StdIn.readInt

  def main(args: Array[String]): Unit = {
    val w = readInt
    if (w.%(2) == 0 && w != 2) println("YES") else println("NO")
  }
}
