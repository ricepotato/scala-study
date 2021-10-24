object HelloWorld {
  def main(args: Array[String]): Unit = {

    val arr: Array[String] = Array("hello", "scala", "!!")
    printArgs1(arr)
    printArgs2(arr)
    printArgs3(arr)
    var formatArr = formatArgs(arr)
    println(formatArr)

  }

  // arr 을 출력하는 함수
  def printArgs1(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }

  // arr 을 출력하는 나은 방법
  def printArgs2(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg)
  }

  def printArgs3(args: Array[String]): Unit = {
    args.foreach(println)
  }

  // 부수효과가 없는 함수
  def formatArgs(args: Array[String]) = args.mkString("\n")

}
