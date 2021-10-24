object HelloWorld {
  def main(args: Array[String]): Unit = {
    val greetingString: Array[String] = new Array[String](3)

    greetingString(0) = "Hello"
    greetingString(1) = ", "
    greetingString(2) = "world \n"

    for (i <- 0 to 2)
      print(greetingString(i))

    // = 메서드가 아래와 같은 모습으로 변경된다
    greetingString.update(0, "Hello")
    greetingString.update(1, ", ")
    greetingString.update(2, "world \n")

    for (i <- 0 to 2)
      print(greetingString(i))

    val greetingString2 = Array("Hello", "world! \n")
    for (i <- 0 to 2)
      print(greetingString2.apply(i))

    greetingString.foreach(print)
    println((1).+(2))
  }
}
