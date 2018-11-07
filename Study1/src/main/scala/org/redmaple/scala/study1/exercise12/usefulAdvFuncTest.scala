package org.redmaple.scala.study1.exercise12

/**
  * @author Max Yu
  * @version 创建时间：2018/11/7 10:03
  * 12.5 一些有用的高阶函数
  */
object usefulAdvFuncTest {
  def main(args: Array[String]): Unit = {
    (1 to 9).map("*" * _).foreach(println _)
    (1 to 9).filter(_ % 2 == 0).foreach(println _)
    println( (1 to 9).reduceLeft(_ * _))
    val array = "Marry has a little lamb".split(" ").sortWith(_.length < _.length)
    array.foreach(x => print(x + " "))
  }
}
