/**
  * Created by zhi on 2016/1/12.
  */
object AppleOrangeBox extends App{
  abstract class Fruit{
    def name:String
  }

  class Apple extends Fruit{
    def name = "apple"
  }

  class Orange extends Fruit{
    def name = "orange"
  }

  abstract class Box{
    def fruit:Fruit
    def contain(afruit:Fruit):Boolean = fruit.name.equals(afruit.name)
    override def toString() = fruit.name.toString + "_box"
  }

  class AppleBox(apple:Apple) extends Box{
    def fruit:Apple= apple
  }
  class OrangeBox(orange:Orange) extends Box{
    def fruit:Orange = orange
  }

  var abox = new AppleBox(new Apple)
  var obox = new OrangeBox(new Orange)
  println(abox)
}



