package org.redmaple.scala.study1.exercise11

/**
  * 11. 带单个参数或无参数的提取器
  */
object Number {
  def unapply(input: String): Option[Int] = {
    try{
      Some(Integer.parseInt(input.trim))
    }
    catch {
      case ex: NumberFormatException => None
    }
  }
}
