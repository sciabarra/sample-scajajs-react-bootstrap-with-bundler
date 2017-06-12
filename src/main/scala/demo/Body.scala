package demo

import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.html_<^._

/**
  * Created by MicheleSciabarra on 16/04/2017.
  */
object Body extends Clock {

  val body = ScalaComponent.builder[Unit]("No args")
    .renderStatic(
      <.div(^.className := "starter-template",
        clock(ClockProps(true,true))
      )
    ).build
}
