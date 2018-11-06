package org.redmaple.scala.study1.exercise10

class ConsoleLogger extends Logger with Cloneable with Serializable {
  def log(msg: String): Unit = {
    println(msg)
  }
}
