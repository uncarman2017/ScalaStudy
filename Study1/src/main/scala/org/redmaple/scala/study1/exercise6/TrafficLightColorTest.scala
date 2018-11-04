package org.redmaple.scala.study1.exercise6
import TrafficLightColor._

object TrafficLightColorTest {
  def main(args: Array[String]): Unit = {
    println(doWhat(Red))
  }

  def doWhat(color: TrafficLightColor) = {
    if(color == Red) "stop"
    else if(color == Yelllow) "hurry up"
    else  "go"
  }
}
