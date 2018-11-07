package org.redmaple.scala.study1.exercise13

/**
  * 13.8 常用方法
  */
object Test3 {
  def main(args: Array[String]): Unit = {
    var numbers = Set(1, 2, 3)
    numbers += 5
    numbers.foreach(a => print(a + " "))
    println()
    var numberVector = Vector(1, 2, 3)
    numberVector :+= 5
    numberVector.foreach(a => print(a + " "))
  }
}
