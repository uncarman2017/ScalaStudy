package org.redmaple.scala.study1.exercise12

/**
  * @author Max Yu
  * @version 创建时间：2018/11/7 9:06
  * 12.1 作为值的函数
  */
object FuncTest {
  import scala.math._
  val num = 3.14
  val fun = ceil _  // 明确fun指向ceil函数

  def main(args: Array[String])={
    println(fun(num))
    val array = Array(3.14,1.42,2.0).map(fun);
    array.foreach(println)
  }
}
