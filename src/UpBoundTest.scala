/**
  * Created by zhi on 2016/1/13.
  */
object UpBoundTest extends App {
  trait Similar{
    def isSimilar(x:Any):Boolean
  }

  case class MyInt(x:Int) extends Similar{
    def isSimilar(m:Any):Boolean = m.isInstanceOf[MyInt] && m.asInstanceOf[MyInt].x == x
  }

  def findSimilar[T <: Similar](x:T,list:List[T]):Boolean = if (list.isEmpty) false
  else if (x.isSimilar(list.head)) true
  else findSimilar(x,list.tail)

  val list:List[Similar] = List(MyInt(1),MyInt(2),MyInt(4))
  println(findSimilar(MyInt(1),list))
  println(findSimilar(MyInt(3),list))
}
