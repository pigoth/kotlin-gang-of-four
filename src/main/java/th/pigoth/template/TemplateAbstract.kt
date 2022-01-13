package th.pigoth.template

abstract class Template {

  private fun header() = "--"

  abstract fun body() :String

  private fun footer() = "**"

  fun all(): String {
    return header() + body() + footer()
  }
}

class ATemplate : Template() {
  override fun body(): String = "A"
}

class BTemplate : Template() {
  override fun body(): String = "B"
}
