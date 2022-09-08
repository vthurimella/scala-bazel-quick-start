package lib

object Points {
  val Origin = Point(0, 0)
}
case class Point(x: Int, y: Int)
case class Rectangle(bottomLeft: Point, topRight: Point)