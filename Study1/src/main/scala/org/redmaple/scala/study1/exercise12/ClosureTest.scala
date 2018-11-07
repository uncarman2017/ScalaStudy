package org.redmaple.scala.study1.exercise12

/**
  * @author Max Yu
  * @version 创建时间：2018/11/7 10:12
  * 12.7 闭包
  */
object ClosureTest {
  def mulBy(factor: Double) = (x: Double) => factor * x

  def main(args: Array[String]) ={
    val triple = mulBy(3)
    val half = mulBy(0.5)
    println(triple(14) + " " + half(14))
  }
}
