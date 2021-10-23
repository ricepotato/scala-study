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
