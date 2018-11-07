package org.redmaple.scala.study1.exercise12

/**
  * @author Max Yu
  * @version 创建时间：2018/11/7 10:15
  * 12.7 柯里化
  */
object CurryingFuncTest {
  def mul(x: Int, y: Int) = x * y

  def mulAtOnce(x: Int) = (y: Int) => x * y

  def main(args: Array[String]): Unit = {
    println(mulAtOnce(6)(7))
  }
}
