object HelloWorld {
  def main(args: Array[String]): Unit = {
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFor = oneTwo ::: threeFour
    val oneTwoThree = 1 :: 2 :: 3 :: Nil

    println(oneTwoThree)
    println(oneTwoThreeFor)
    //println(oneTwo + " and " + threeFour + "were not mutated.")
    //println("Thus, " + oneTwoThreeFor + " is a new list.")
  }
}
