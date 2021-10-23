object PrintStrings {
  def main(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      if (i != 0)
        print(" ")
      print(args(i))
      i += 1
    }
    println("")
    // forearch 사용
    args.foreach((arg: String) => println(arg))
    println("")
    // 리터럴이 인자를 하나만 받는 문장인 경우 인자에 이름 필요없음
    args.foreach(println)
  }
}
