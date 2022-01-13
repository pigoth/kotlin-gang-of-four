package th.pigoth.template

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateTest {

  @Test
  internal fun should_use_a_template_abstraction_based() {
    assertThat(ATemplate().all()).isEqualTo("--A**")
    assertThat(BTemplate().all()).isEqualTo("--B**")
  }

  @Test
  internal fun should_use_func_based() {
    assertThat(TemplateFunc().all { "A" }).isEqualTo("--A**")
  }
}
