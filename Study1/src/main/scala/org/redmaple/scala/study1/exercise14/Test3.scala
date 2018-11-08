package org.redmaple.scala.study1.exercise14

/**
  * 14.7 变量声明中的模式
  */
object Test3 {
  def main(args: Array[String]): Unit = {
    val (q, r) = BigInt(10) /% 3
    println("q=" + q)
    println("r=" + r)

//    for ((k, v) <- System.getProperties() if v == "") println(k)
  }
}
