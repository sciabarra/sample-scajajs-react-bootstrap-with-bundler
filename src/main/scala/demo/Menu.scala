package demo

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._

/**
  * Created by MicheleSciabarra on 16/04/2017.
  */
object Menu {

  val Hello = ScalaComponent.builder[String]("Hello")
    .render_P(name => <.div(^.className := "navbar-header",
      <.a(^.className := "navbar-brand",
        ^.href := "#", name)))
    .build

  val menu = ScalaComponent.builder[Unit]("No args")
    .renderStatic(
      <.div(^.className := "container-fluid",
        Hello("Hello world"),
        <.ul(^.className := "nav navbar-nav",
          <.li(^.className := "active",
            <.a(^.href := "#", "Home")
          ),
          <.li(
            <.a(^.href := "#", "Page 1")
          ),
          <.li(
            <.a(^.href := "#", "Page 2")
          ),
          <.li(
            <.a(^.href := "#", "Page 3")
          )
        )
      )
    ).build
}
