import lib.{Points, Point, Rectangle}

object HelloWorld extends App {
  val topRight = Point(1, 2)
  val r = Rectangle(Points.Origin, topRight)
  println(r)
}