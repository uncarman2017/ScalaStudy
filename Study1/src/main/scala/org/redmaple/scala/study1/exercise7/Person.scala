/**
  * 7.4 文件顶部标记法
  */
package org.redmaple.scala.study1.exercise7
package  people

/**
  * 7.6 包可见性
  */
class Person {

  private val name = "Max Yu";

  // 将类成员的可见度提升到上一级包
  private[exercise7] def description = "A person with name " + name;
}
