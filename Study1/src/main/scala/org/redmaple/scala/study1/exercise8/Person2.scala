package org.redmaple.scala.study1.exercise8

/**
  * 8.8 抽象类
  * @param name
  */
abstract class Person2(val name: String) {
  def id: Int
}

class Employee2(name: String) extends Person2(name){
  def id = name.hashCode
}
