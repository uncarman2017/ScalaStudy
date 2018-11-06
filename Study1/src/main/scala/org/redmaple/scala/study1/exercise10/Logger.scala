package org.redmaple.scala.study1.exercise10

/**
  * 10.2 当做接口使用的特质
  */
trait Logger {
  def log(msg: String); // 抽象方法
  def info(msg: String){log("INFO: " + msg)}
  def warn(msg: String){log("WARN: " + msg)}
  def severe(msg: String){log("SEVERE: " + msg)}

}
