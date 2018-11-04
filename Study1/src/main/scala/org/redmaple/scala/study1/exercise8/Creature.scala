package org.redmaple.scala.study1.exercise8

/**
  * 构造顺序和提前定义
  */
class Creature {
  val range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}

class Ant extends Creature {
  override val range = 2
}

class Ant2 extends {
  override val range = 2
  } with Creature
