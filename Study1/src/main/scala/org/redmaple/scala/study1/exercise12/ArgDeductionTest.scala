package org.redmaple.scala.study1.exercise12

/**
  * @author Max Yu
  * @version 创建时间：2018/11/7 9:42
  * 12.4 参数(类型)推断
  */
object ArgDeductionTest {
  def valueAtOneQuarter(f: (Double) => Double) = f(0.25) // 定义高阶函数
  def main(args: Array[String]): Unit = {
    var result = valueAtOneQuarter(x => 3 * x)
    println("result=" + result)
    result = valueAtOneQuarter(3 * _)
    println("result=" + result)
  }
}
