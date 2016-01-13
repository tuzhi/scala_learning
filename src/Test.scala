/**
  * Created by zhi on 2016/1/11.
  */
//object HelloWorld {
//  def main(args: Array[String]): Unit = {
//    println("Hello, world!")
//  }
//}

//object HelloWorld extends App {
//  println("Hello, world3!")
//}

object Test extends App {
  class Stack[T] {
    var elems: List[T] = Nil
    def push(x: T) { elems = x :: elems }
    def top: T = elems.head
    def pop() { elems = elems.tail }
  }
  val stack = new Stack[Int]
  stack.push(1)
  stack.push('a')
  println(stack.top)
  stack.pop()
  println(stack.top)
}

