package th.pigoth.strategy

class TotalAmount (private val price: Int, private val quantity: Int, private val discount: (Int) -> Int)  {

  fun calculate() : Int {
    val amount = price * quantity
    return amount - discount(amount)
  }

}

fun fiftyPercentDiscount(): (Int) -> Int = { amount -> amount / 2 }
fun noDiscount(): (Int) -> Int = { 0 }
