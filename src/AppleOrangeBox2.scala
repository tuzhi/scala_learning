/**
  * Created by zhi on 2016/1/12.
  */
object AppleOrangeBox2 extends App{
  abstract class Fruit_2{
    def name:String
  }
  class Apple_2 extends Fruit_2{
    def name = "apple"
  }
  class Orange_2 extends Fruit_2{
    def name = "orange"
  }

  class Box_2[F <: Fruit_2](aFruit: F) {

    def fruit: F = aFruit

    def contains(aFruit: Fruit_2) = fruit.name == aFruit.name

    override def toString():String = fruit.name + "_box2"
  }

  var appleBox = new Box_2[Apple_2](new Apple_2)
  println(appleBox)
}