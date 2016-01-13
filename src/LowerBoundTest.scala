/**
  * Created by zhi on 2016/1/13.
  */
object LowerBoundTest extends App{
//  case class ListNode[T](h:T,list:ListNode[T]){
//    def head:T = h
//    def tail:ListNode[T] = list
//    def prepend(element:T):ListNode[T] = ListNode(element,this)
//  }

  case class ListNode[+T](h:T,list:ListNode[T]){
    def head:T = h
    def tail:ListNode[T] = list
    def prepend[U>:T](element:U):ListNode[U] = ListNode(element,this)
  }

  val empty: ListNode[Null] = ListNode(null, null)
  val strList: ListNode[String] = empty.prepend("hello").prepend("world")
  val anyList: ListNode[Any] = strList.prepend(12345)
  println(anyList)

  println("hello".isInstanceOf[String])
}
