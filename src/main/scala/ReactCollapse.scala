import japgolly.scalajs.react._

import scala.scalajs.js.annotation.JSName
import scalajs.js

/**
  * Created by msciab on 18/05/17.
  */
object ReactCollapse {

  @JSName("ReactCollapse")
  @js.native
  object RawComponent extends js.Object

  @js.native
  trait Props extends js.Object {
    var isOpened: Boolean = js.native
  }

  def props(isOpened: Boolean): Props = {
    val p = (new js.Object).asInstanceOf[Props]
    p.isOpened = isOpened
    p
  }

  val component = JsComponent[Props, Children.Varargs, Null](RawComponent)
}
