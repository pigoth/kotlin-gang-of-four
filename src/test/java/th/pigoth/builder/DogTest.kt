package th.pigoth.builder

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import th.pigoth.builder.Dog.Size.SMALL

internal class DogTest {
  @Test
  internal fun should_create_a_dog() {
    val dog = Dog("aName", SMALL)

    assertThat(dog.name).isEqualTo("aName")
    assertThat(dog.size).isEqualTo(SMALL)
  }
}
