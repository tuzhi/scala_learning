/**
  * Created by zhi on 2016/1/12.
  */
object CovariantTest extends App{
  trait Cat[+T] {
    def meow: T
  }

  val child = new Cat[String] {
    def meow:String = "miaomiao~~"
  }
  val parent: Cat[Any] = child

  val voice:Any = parent.meow

  println(voice)
}
