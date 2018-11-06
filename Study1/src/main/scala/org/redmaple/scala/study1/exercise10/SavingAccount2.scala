package org.redmaple.scala.study1.exercise10

/**
  * 10.11 初始化特质中的字段
  */
class SavingAccount2 extends {
  val fileName = "savings.log"

} with Account with FileLogger {

}
