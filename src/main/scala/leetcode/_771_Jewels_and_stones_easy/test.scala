package leetcode._771_Jewels_and_stones_easy

object test extends App {
  val aa = Map("a" -> "1", "b" -> 1, "c" -> None)

  def getDir(key: String) = aa.get(key).map(_.toString).getOrElse(
    throw new IllegalArgumentException(s"'$key' should be specified in yaml configuration")
  )

  println(getDir("c"))

  val a = aa.getOrElse("c", throw new IllegalArgumentException("111"))
//  val b = aa.getOrElse("c", throw new IllegalArgumentException("111"))
//  println(new IllegalArgumentException("111"))

}
