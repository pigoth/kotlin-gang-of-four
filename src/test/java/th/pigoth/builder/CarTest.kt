package th.pigoth.builder

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CarTest {

  @Test
  internal fun should_build_a_car() {
    val car = Car().apply {
      color = "red"
      maxKmForHour = 180
    }

    val expected = Car()
    expected.maxKmForHour = 180
    expected.color = "red"
    assertThat(car).isEqualTo(expected)
  }
}
