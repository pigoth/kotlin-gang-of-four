package th.pigoth.builder

class Car {
  var maxKmForHour: Int = 0
  var color: String? = null

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as Car

    if (maxKmForHour != other.maxKmForHour) return false
    if (color != other.color) return false

    return true
  }

  override fun hashCode(): Int {
    var result = maxKmForHour
    result = 31 * result + (color?.hashCode() ?: 0)
    return result
  }

}
