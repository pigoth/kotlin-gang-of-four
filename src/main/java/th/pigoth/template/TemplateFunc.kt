package th.pigoth.template

class TemplateFunc() {
  private fun header() = "--"

  private fun footer() = "**"

  fun all(body: () -> String) : String = "${header()}${body()}${footer()}"
}
