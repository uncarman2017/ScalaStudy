package org.redmaple.scala.study1.exercise12

/**
  * @author Max Yu
  * @version 创建时间：2018/11/7 9:28
  * 12.3 带函数参数的函数
  */
object FuncArgTest {

  def valueAtOneQuarter(f: (Double) => Double) = f(0.25)  // 定义高阶函数
  def mulBy(factor: Double) = (x: Double) => factor * x

  def main(args: Array[String])={

    var result = valueAtOneQuarter(math.ceil _)
    println("result=" + result)
    result = valueAtOneQuarter(math.sqrt _)
    println("result=" + result)

    val quintuple = mulBy(5)
    println("result=" + quintuple(20))
  }
}
