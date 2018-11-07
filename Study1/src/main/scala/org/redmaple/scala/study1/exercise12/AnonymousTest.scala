package org.redmaple.scala.study1.exercise12

/**
  * @author Max Yu
  * @version 创建时间：2018/11/7 9:21
  * 12.2 匿名函数
  */
object AnonymousTest {
  def main(args: Array[String]): Unit = {
    val triple = (x: Double) => 3 * x
    println(triple(943))
  }
}
