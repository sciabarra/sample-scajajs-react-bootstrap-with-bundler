package demo

import japgolly.scalajs.react.WebpackRequire
import org.scalajs.dom.document

import scala.scalajs.js.JSApp

object Main extends JSApp {

  def require(): Unit = {
    WebpackRequire.React
    WebpackRequire.ReactDOM
    ()
  }

  def main(): Unit = {
    require()
    Menu.menu().renderIntoDOM(document.getElementById("menu"))
    Body.body().renderIntoDOM(document.getElementById("body"))
   }
}
