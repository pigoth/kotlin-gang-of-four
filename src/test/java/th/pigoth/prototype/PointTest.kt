package th.pigoth.prototype

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PointTest {

  @Test
  internal fun should_create_a_point_from_base_point() {
    val template = Point()

    val myPoint = template.copy(x = 10)

    assertThat(myPoint).isNotEqualTo(template)
    assertThat(myPoint).isEqualTo(Point(x = 10))
  }
}
