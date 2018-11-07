package org.redmaple.scala.study1.exercise13

/**
  * @author Max Yu
  * @version 创建时间：2018/11/7 17:09
  * 13.1 主要的集合特质
  */
object Test1 {
  def main(args: Array[String]): Unit = {
    val set = (1 to 10).toIterator;
    while (set.hasNext) {
      set.next()
    }

  }

}
