package org.redmaple.scala.study1.exercise13

/**
  * 13.6 线程安全的集合
  */
object Test5 {
  def main(args: Array[String]): Unit ={
    var scores = new scala.collection.mutable.HashMap[String,Int] with
                scala.collection.mutable.SynchronizedMap[String,Int]
  }
}
