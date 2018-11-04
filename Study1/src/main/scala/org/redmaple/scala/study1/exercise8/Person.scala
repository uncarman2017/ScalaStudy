package org.redmaple.scala.study1.exercise8

import scala.beans.BeanProperty

class Person {
  @BeanProperty
  var name: String = _

  @BeanProperty
  var salary: Double = 0.0

  // 重写一个非抽象方法必须使用override修饰符
  override def toString = getClass.getName + "[name=" + name + "]"
}
