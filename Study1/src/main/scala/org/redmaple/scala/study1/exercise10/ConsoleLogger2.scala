package org.redmaple.scala.study1.exercise10

/**
* 10.3 带有具体实现的特质
*/
trait ConsoleLogger2 {
  def log(msg: String): Unit = {
    println(msg)
  }
}
