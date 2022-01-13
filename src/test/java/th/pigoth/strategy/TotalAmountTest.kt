package th.pigoth.strategy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TotalAmountTest {

  @Test
  internal fun should_calculate_total_amount_without_discount() {
    assertThat(TotalAmount(1, 1, noDiscount()).calculate()).isEqualTo(1)
  }

  @Test
  internal fun should_calculate_total_amount_with_50_per_cent_promotion() {
    assertThat(TotalAmount(2, 1, fiftyPercentDiscount()).calculate()).isEqualTo(1)
  }

}
