package org.redmaple.scala.study1.exercise12

/**
  * @author Max Yu
  * @version 创建时间：2018/11/7 10:29
  * 12.10 return表达式
  */
object ReturnTest {
  def indexOf(str: String, ch: Char): Int = {
    var i = 0;
    while (i < str.length) {
      if (str(i) == ch) return i;
      i += 1
    }
    return -1;
  }

  def main(args: Array[String]): Unit = {
    print(indexOf("Max Yu and GuoGuo",'G'))
  }
}
