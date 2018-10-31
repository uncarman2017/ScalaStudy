package org.redmaple.scala.study1

import scala.math._;

/**
  * 第1章 基础
  */
object Exercise1 {
  def main(args: Array[String]): Unit = {
    println("=====================1.2 声明值和变量=====================")
    testValAndVar()
    println("=====================1.3 常用类型========================")
    testUsualType()
    println("=====================1.4 算术和操作符重载========================")
    testArithAndOperator()
    println("=====================1.5 调用函数和方法========================")
    testMathFunction()
    println("=====================1.6 apply方法========================")
    testApply()
    println("=====================1.7 scala doc中的方法========================")
    testScalaDoc()

  }


  /**
    * 1.2 声明值和变量
    * Scala数据类型: Byte,Char,Short,Int,Long,Float,Double,Boolean 不分基本类型和引用类型
    */
  def testValAndVar(): Unit = {
    val int: Int = 32 * 41 + 1;
    println("int=" + int);
    var str = "我是随意的字符串";
    println("str=" + str);
    val str2: String = "我是声明过类型的字符串";
    println("str2=" + str2);
    var dbl: Double = 0;
    dbl = 32 * 41 + 0.8;
    println("dbl=" + dbl);
    str = "我是厨房";
    println("str=" + str);
    val any1, any2: Any = "我是任意类型";
    println("any1=" + any1)
    println("any2=" + any2)
    val b: Boolean = true
    println("b=" + b);

  }

  /**
    * 1.3 常用类型
    */
  def testUsualType(): Unit = {
    var str = 1.toString();
    println("str=" + str);
    println("99 to char is " + 99.toChar)
    println("99.88 to double is " + "99.88".toDouble)
    var range = 1.to(10);
    println(range);
    println("MaxYu".intersect("Yu"));
  }

  /**
    * 1.4 算术和操作符重载
    */
  def testArithAndOperator(): Unit = {
    var a: Double = 1 / 8;
    var b = 20 % 3;
    val c: BigInt = 123456789;
    val d: BigInt = c * c * c;
    println("a=" + a);
    println("b=" + b);
    println("c=" + c);
    println("d=" + d);

  }

  /**
    * 1.5 调用函数和方法
    */
  def testMathFunction(): Unit = {
    val c: BigInt = 123456789;
    println("power(c)=" + pow(c.toDouble, 3));
    println("BigInt随机数: " + BigInt.probablePrime(100, util.Random))
    println("Max Yu Poping Max".distinct)
  }

  /**
    * 1.6 apply方法
    */
  def testApply(): Unit = {
    // apply()方法重载()操作符
    println("取'abcdef'第3个字符:" + "abcdef" (2))
    println("取'震感舞麦神Max'第3,6个字符:" + "震感舞麦神Max" (2) + " " + "震感舞麦神Max" (5))
    println("apply方法取'abcdef'第3个字符:" + "abcdef".apply(2))
    println("转换字符串至BigInt:" + BigInt("1234567890"))
    println("apply方法转换字符串至BigInt:" + BigInt.apply("1234567890"))
    var arr: Array[Int] = Array(1,3,4,5,6);
    println(arr.length);
  }

  /**
    * 1.7 scala doc
    */
  def testScalaDoc(): Unit ={
    println("harry".patch(1,"ung",2))
  }

}


