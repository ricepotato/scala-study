# scala study

## 상수 변수

msg 의 타입을 scala 가 추론한다.
println 함수로 출력할 수 있다.

```scala
scala> val msg = "hello world"
val msg: String = hello world

scala> println(msg)
hello world
```

java 의 String 타입 지정. 간단히 사용 가능

```scala
scala> val msg2: java.lang.String = "Hello again, world!"
val msg2: String = Hello again, world!

scala> print(msg2)
Hello again, world!
```

`val` 로 선언하면 재할당 할 수 없다.

```scala

scala> msg2 = "goodbye cruel world!"
-- Error:
1 |msg2 = "goodbye cruel world!"
  |^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  |Reassignment to val msg2
```

재할당이 가능한 변수를 선언하려면 `var` 을 사용한다.

```scala
scala> var greeting = "hello, world!"
var greeting: String = hello, world!

scala> greeting = "Leave me alone world!"
greeting: String = Leave me alone world!
```

## 함수

함수 정의

파라미터는 타입을 추론하지 않으므로 모든 파라미터에 콜론뒤에 타입을 반드시 지정

닫은 괄호 뒤에는 결과 타입을 지정

```scala
scala> def max(x: Int, y: Int): Int = {
     | if (x > y) x
     | else y
     | }
def max(x: Int, y: Int): Int
```

함수 본문에 문장이 하나밖에 안들어간다면 중괄호 생략 가능

```scala
scala> def add(x: Int, y:Int) = x + y
def add(x: Int, y: Int): Int

scala> add(2 ,3)
val res0: Int = 5
```

파라미터도 받지 않고 결과도 없는 함수

Unit 는 greet 의 결과 타입이다. Unit 는 함수가 반환값을 반환하지 않는다는 의미이다. void 와 비슷

```scala
scala> def greet() = println("Hello, world!")
def greet(): Unit

scala> greet()
Hello, world!
```

스칼라 스크립트

hello.scala

```scala
println("Hello, world!")
```

아래 오류 발생

```scala
C:\Users\sukju\dev\first_scala>scala hello.scala
-- [E103] Syntax Error: C:\Users\sukju\dev\first_scala\hello.scala:1:0 ---------
1 |println("Hello, world from a script!")
  |^^^^^^^
  |Illegal start of toplevel definition

longer explanation available when compiling with `-explain`
1 error found
Error: Errors encountered during compilation
```

hello.scala 정상 실행

```scala
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
  }
}
```

결과

```bash
$ scala hello.scala
Hello, world!
```

명령행 인자 받기

```scala
// 주석은 이렇게 작성한다
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, " + args(0) + " world!")
  }
}
```

명령행 인자를 받은 텍스트 모두 출럭

```scala
object PrintStrings {
  def main(args: Array[String]): Unit = {
    var i = 0
    while(i < args.length){
      println(args(i))
      i += 1
    }
  }
}
```

배열 열거하기

```scala
val greetingString: Array[String] = new Array[String](3)

    greetingString(0) = "Hello"
    greetingString(1) = ", "
    greetingString(2) = "world \n"

    for (i <- 0 to 2)
      print(greetingString(i))

    greetingString.foreach(print)
```

연산자는 메소드이다

```scala

println(1 + 2)
println((1).+(2))

```

변수뒤에 괄호를 둘러싸서 호출하면 그 크도를 변수에 대해 apply 메소드를 호출하는 것으로 바꾼다.

```scala
greetingString(0) = "Hello"
greetingString(1) = ", "
greetingString(2) = "world \n"
```

같은 타입의 객체로 이루어진 변경 불가능한 시퀀스 List 클래스

```scala
val oneTwoThree = List(1, 2, 3)
val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFor = oneTwo ::: threeFour
```

변경 불가능하지만 다른 타입의 원소를 넣을 수 있는 튜플

```scala
scala> val pair = (99, "Luftballons")
val pair: (Int, String) = (99,Luftballons)

scala> println(pair._1)
99

scala> println(pair._2)
Luftballons
```

변경 불가능한 집합을 만들고 초기화 사용

아래 코드에서 jetSet += "Lear" 를 실행하면 새로은 객체가 생성된다.

```scala
scala> var jetSet = Set("Boeing", "Aribus")
var jetSet: Set[String] = Set(Boeing, Aribus)

scala> jetSet
val res0: Set[String] = Set(Boeing, Aribus)

scala> jetSet += "Lear"

scala> println(jetSet.contains("Cessna"))
false

scala> jetSet
val res1: Set[String] = Set(Boeing, Aribus, Lear)
```

변경 가능한 집합 사용 예

scala.collection.mutable 이 필요하다.

```scala
scala> import scala.collection.mutable

scala> val movieSet = mutable.Set("Hitch", "Poltergeist")
val movieSet: scala.collection.mutable.Set[String] = HashSet(Hitch, Poltergeist)

scala> movieSet += "Shrek"
val res2: scala.collection.mutable.Set[String] = HashSet(Hitch, Shrek, Poltergeist)

scala> println(movieSet)
HashSet(Hitch, Shrek, Poltergeist)
```

변경가능한 Map

```scala
scala> val treasureMap = mutable.Map[Int, String]()
val treasureMap: scala.collection.mutable.Map[Int, String] = HashMap()

scala> treasureMap += (1 -> "Go to island.")
val res4: scala.collection.mutable.Map[Int, String] = HashMap(1 -> Go to island.)

scala> treasureMap += (2 -> "Find big X on ground.")
val res5: scala.collection.mutable.Map[Int, String] = HashMap(1 -> Go to island., 2 -> Find big X on ground.)

scala> treasureMap += (3 -> "Dig.")
val res6: scala.collection.mutable.Map[Int, String] = HashMap(1 -> Go to island., 2 -> Find big X on ground., 3 -> Dig.)

scala> println(treasureMap(2))
Find big X on ground.
```

변경 불가능한 맵

```scala
scala> val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
val romanNumeral: Map[Int, String] = HashMap(5 -> V, 1 -> I, 2 -> II, 3 -> III, 4 ->
IV)

scala> println(romanNumeral(4))
IV
```
