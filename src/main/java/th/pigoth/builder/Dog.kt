package th.pigoth.builder

import th.pigoth.builder.Dog.Size.NO_SIZE


data class Dog(val name: String = "no name", val size: Size = NO_SIZE) {

  enum class Size {
    NO_SIZE, SMALL, MEDIUM, BIG
  }
}
