package th.pigoth.visitor

interface Shape

data class Rectangle(val x: Int, val y: Int) : Shape
data class Square(val x: Int) : Shape

val areaVisitor = { shape: Shape ->
  when (shape) {
    is Square -> shape.x * shape.x
    is Rectangle -> shape.x * shape.y
    else -> 0
  }
}

val perimeterVisitor = { shape: Shape ->
  when (shape) {
    is Rectangle -> shape.x * 2 + shape.y * 2
    is Square -> shape.x * 4
    else -> 0
  }
}

fun calculate(shapes: List<Shape>, visitor: (Shape) -> Int) = shapes.map(visitor).sum()


