package org.redmaple.scala.study1.exercise10

import java.io.PrintStream

/**
  * 10.11 初始化特质中的字段
  */
trait FileLogger extends Logger {
  val fileName: String;
  lazy val out = new PrintStream((fileName))

  def log(msg: String) {
    out.println(msg)
  }
}
