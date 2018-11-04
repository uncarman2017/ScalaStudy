package org.redmaple.scala.study1.exercise6

/**
  * 6.4 apply方法
  * @param id
  * @param initialBalance
  */
class Account2 private(val id: Int, initialBalance: Double) {
  private var balance = initialBalance;
}

object Account2 {
  private var lastNumber = 0;

  private def newUniqueNumber() = {
    lastNumber += 1;
    lastNumber;
  }

  def apply(initialBalance: Double) = new Account2(newUniqueNumber(), initialBalance);
}
