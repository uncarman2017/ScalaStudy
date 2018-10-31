package org.redmaple.scala.study1

import java.io.IOException
import java.net.URL
import java.text.MessageFormat

import scala.math._;

/**
  * 第二章 控制结构和函数
  */
object Exercise2 {

  // 方法返回值Unit相当于Java中的void
  def main(args: Array[String]): Unit = {
    println("=====================2.1 条件表达式=====================")
    testConditionExp()
    println("=====================2.2 语句终止=======================")
    testSentencesFinal()
    //    println("=====================2.4 输入和输出=======================")
    //    testInputOutput()
    println("=====================2.5 循环============================")
    testLoop()
    println("=====================2.6 高级for循环和for推导式=========================")
    testAdvLoop()
    println("=====================2.7 函数=========================")
    println("fac=" + fac(10))
    println("facRecursion=" + facRecursion(10))
    println("=====================2.8 默认参数和带名参数=========================")
    println("decorate=" + decorate("青铜圣斗士"))
    println("decorate=" + decorate("白银圣斗士", "<", ">"))
    println("=====================2.9 变长参数=========================")
    println("sum=" + sum(1, 2, 3, 4, 5, 6))
    println("sum=" + sum(1 to 6: _*))
    println("sum=" + sumRecursion(1, 2, 3, 4, 5, 6))
    //调用变长参数且参数类型为Object的Java方法时,需要手工对基本类型进行转换
    println(MessageFormat.format("{0}今年{1}岁,他的宝宝是{2}", "Max", 41.asInstanceOf[AnyRef], "果果"))
    println("=====================2.10 过程=========================")
    procedure1("麦麦和侠胆大白狮");
    println("=====================2.11 懒值=========================")
    lazyValue("/data/appdatas/client.xml")
    println("=====================2.12 异常=========================")
//    var x = testThrow(-100)
    println("result=" + testThrow2(100))
    println(testThrow2(-100))
    println(testThrow3("https://rescdn.qqmail.com/zh_CN/htmledition/images/webp/spacer1e9c5d.gif"))

  }

  /**
    * 2.1 条件表达式
    */
  def testConditionExp(): Unit = {

    var x = 1;
    var s = if (x > 0) "More" else "Less"
    println(s)
    x = 0;
    s = if (x > 0) "More" else if (x == 0) "Zero" else "Less"
    println(s)

  }

  /**
    * 2.2 语句终止
    */
  def testSentencesFinal(): Unit = {
    val x = 134 * 8 +
      200;
    println("x=" + x)
  }

  /**
    * 2.4 输入和输出
    */
  def testInputOutput(): Unit = {
    print("Your Name:")
    var name = io.StdIn.readLine()
    print("Your Age:")
    val age = io.StdIn.readInt()
    printf("Hello,%s! Next year, you will be %d years old\n", name, age + 1);
  }

  /**
    * 2.5 循环
    */
  def testLoop(): Unit = {
    var n: Int = 6;
    var r: Int = 1;
    while (n > 0) {
      r *= n;
      n -= 1;

    }
    println("r=" + r)
    n = 6;
    r = 1;
    for (i <- 1 to n) {
      r *= i
    }
    println("r=" + r)
  }

  /**
    * 2.6 高级for循环和for推导式
    */
  def testAdvLoop(): Unit = {

    for (i <- 1 to 5; j <- 1 to 3) print((10 * i + j) + " ")
    println()
    // for语句守卫
    for (i <- 1 to 5; j <- 1 to 3 if i != j) print((10 * i + j) + " ")

    println()
    // for语句多定义
    for (i <- 1 to 3; from = 4 - i; j <- from to 3) print((10 * i + j) + " ")

    println()
    for (i <- 1 to 10) yield i % 3;
  }


  def fac(n: Int) = {
    var r = 1
    for (i <- 1 to n) r *= i
    r
  }

  def facRecursion(n: Int): Int = {
    var r = if (n <= 0) 1 else n * facRecursion(n - 1)
    r
  }

  def decorate(str: String, left: String = "[", right: String = "]") =
    left + str + right

  def sum(args: Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  def sumRecursion(args: Int*): Int = {
    if (args.length == 0) 0
    else args.head + sumRecursion(args.tail: _*)
  }

  def procedure1(s: String) {
    println(s)
  }

  def lazyValue(filePath: String) {
    lazy val word = io.Source.fromFile(filePath).mkString
    println(word)
  }

  def testThrow(x: Int): Double = {
    if (x >= 0) sqrt(x)
    else throw new IllegalArgumentException("x should be negative")
  }

  def testThrow2(x: Int): Double = {
    var r: Double = 0;
    try {
      r = sqrt(x)
    }
    catch {
      case ex: IllegalArgumentException => ex.printStackTrace()
    }
    r
  }

  def testThrow3(url: String): Unit = {
    var in = new URL(url).openStream()
    try {

    }
    catch {
      case ex: IOException => ex.printStackTrace()
    }
    finally {
      printf("Stream closed")
      in.close()
    }
  }

}
