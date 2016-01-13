/**
  * Created by zhi on 2016/1/12.
  */


object VariancesTest extends App {
  abstract class A{
  }
  class Stack[+A] {
    def push[B >: A](elem: B): Stack[B] = new Stack[B] {
      var xx :Int = 3
      override def top: B = elem
      override def pop: Stack[B] = Stack.this
      override def toString() = elem.toString() + "__" +
        Stack.this.toString()
    }
    def top: A = sys.error("no element on stack")
    def pop: Stack[A] = sys.error("no element on stack")
    override def toString() = ""
  }

  var s: Stack[Any] = new Stack().push("hello1");
  s = s.push(new Object())
  s = s.push(7)
  println(s)
}