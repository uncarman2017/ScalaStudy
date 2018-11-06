package org.redmaple.scala.study1.exercise10

/**
  * 10.4 带有特质的对象
  */
object NotraitAccountTest {
  def main(args: Array[String]): Unit ={
    val account = new NotraitAccount with ConsoleLogger2
  }
}
