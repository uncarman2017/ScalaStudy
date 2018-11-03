package org.redmaple.scala.study1.exercise5

object PersonTest {
  def main(args: Array[String]): Unit = {
    val p1 = new Person();
    val p2 = new Person("Max Yu")
    val p3 = new Person(name = "Max Yu",age = 41)
  }
}
