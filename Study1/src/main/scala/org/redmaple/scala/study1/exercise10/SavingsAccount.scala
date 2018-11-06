package org.redmaple.scala.study1.exercise10

class SavingsAccount extends  Account with ConsoleLogger2 {
  private var balance: Double = 0.0;

  def withdraw(amount: Double): Unit ={
    if(amount > balance) log("Insuffcient funds")
    else balance -= amount
  }
}
