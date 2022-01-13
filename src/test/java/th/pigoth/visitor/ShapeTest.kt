package th.pigoth.visitor

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShapeTest {

  private val shapes = listOf(
    Rectangle(2, 1),
    Square(2)
  )

  @Test
  internal fun should_calculate_perimeter_of_shapes() {
    assertThat(calculate(shapes, perimeterVisitor)).isEqualTo(14)
  }

  @Test
  internal fun should_calculate_areas_of_shapes() {
    assertThat(calculate(shapes, areaVisitor)).isEqualTo(6)
  }

}
