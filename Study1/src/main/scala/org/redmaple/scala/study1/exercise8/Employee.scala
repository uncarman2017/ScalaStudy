package org.redmaple.scala.study1.exercise8


class Employee extends Person {
  override def toString: String = super.toString + "[salary=" + salary + "]"
}
