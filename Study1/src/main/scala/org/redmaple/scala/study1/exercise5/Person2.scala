package org.redmaple.scala.study1.exercise5

/**
  * 主构造器
  * @param name
  * @param age
  */
class Person2(name: String = "", age: Int = 0) {
  println("person is created")
  def description = name + " is " + age + " years old"
}
