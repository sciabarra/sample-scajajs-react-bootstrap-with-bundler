package demo

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import scala.scalajs.js.Date
import scala.scalajs.js.timers.setInterval
import scala.scalajs.js.timers.clearInterval
import scala.scalajs.js.timers.SetIntervalHandle

/**
  * Created by msciab on 20/05/17.
  */
trait Clock {

  case class ClockState(handle: Option[SetIntervalHandle] = None, now: Date = new Date())

  case class ClockProps(date: Boolean = false, time: Boolean = true)

  class ClockBackend(bs: BackendScope[ClockProps, ClockState]) {

    def start = {
      val id = setInterval(1000) {
        bs.modState(st => st.copy(now = new Date())).runNow()
      }
      bs.modState(st => st.copy(handle = Some(id)))
    }

    def stop = bs.modState(st => {
      clearInterval(st.handle.get)
      st.copy(handle = None)
    })
  }

  val clock = ScalaComponent.builder[ClockProps]("Clock")
    .initialState(ClockState())
    .backend(new ClockBackend(_))
    .render_PS( (p, s) => {
      val d = if(p.date) s.now.toTimeString() else ""
      val t = if(p.time) s.now.toDateString() else ""
      <.div(d+" "+t)
    })
    .componentDidMount(_.backend.start)
    .componentWillUnmount(_.backend.stop)
    .build
}
