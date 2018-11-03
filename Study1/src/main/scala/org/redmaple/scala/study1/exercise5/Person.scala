package org.redmaple.scala.study1.exercise5

class Person {
  private var name = "";
  private var age: Int = 0;

  def this(name: String) {
    this();
    this.name = name;
  }

  def this(name: String, age: Int) {
    this();
    this.name = name;
    this.age = age;
  }
}
