package org.redmaple.scala.study1.exercise5

import scala.beans.BeanProperty

/**
  *
  */
class Counter {
  private var value = 0; // 你必须初始化的字段

  private[this] var myAge = 41;

  val timeStamp = new java.util.Date();

  @BeanProperty
  var name: String = _

  def increment() {
    value += 1
  }

  // 方法默认是公有的
  def current() = value;

  def age = myAge;

  def age_ (newValue: Int)=  {
    if (newValue > myAge) myAge = newValue;
  }


}
