package org.redmaple.scala.study1.exercise6

/**
  * 6.2 伴生对象示例
  */
class Account {
  private var balance = 0.0;
  val id = Account.newUniqueNumber();  // 可以访问伴生对象的私有方法

  def deposit(amount: Double): Unit = {
    balance += amount
  }

}

object Account {
  private var lastNumber = 0;

  private def newUniqueNumber() = {
    lastNumber += 1;
    lastNumber;
  }
}
