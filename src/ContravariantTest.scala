/**
  * Created by zhi on 2016/1/12.
  */
object ContravariantTest extends App {
  trait Cat[-T] {
    def meow: Any
  }

  val child = new Cat[Any] {
    def meow:Any = 123
  }
  val parent: Cat[String] = child
//
//  val voice:String = parent.meow  // error !!!

  println(parent.meow)
}
