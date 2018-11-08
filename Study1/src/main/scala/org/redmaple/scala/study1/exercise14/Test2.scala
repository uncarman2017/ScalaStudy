package org.redmaple.scala.study1.exercise14

/**
  * 14.2 守卫
  */
object Test2 {
  def main(args: Array[String]): Unit = {
    val ch = '2'
    var sign = 0
    ch match {
      case '+' => sign = 1
      case '-' => sign = -1
      case _ if Character.isDigit(ch) => sign = Character.digit(ch, 10)
      case _ => sign = 0
    }

    println("sign=" + sign)
  }
}
