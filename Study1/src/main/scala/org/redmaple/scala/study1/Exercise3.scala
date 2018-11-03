package org.redmaple.scala.study1

import collection.mutable.ArrayBuffer

/**
  * 第三章：数组相关操作
  */
object Exercise3 {

  def main(args: Array[String]): Unit = {
    println("=============================3.1 定长数组===============================")
    testFixedArray()
    println("=============================3.2 变长数组===============================")
    testDynamicArray()
    println("=============================3.3 遍历数组和数组缓冲=======================")
    testIterateArray()
  }

  /**
    * 3.1 定长数组
    */
  def testFixedArray(): Unit = {
    // 整数数组，所有元素初始化为0
    val nums = new Array[Int](8)
    println(nums)

    // 字符串数组，所有元素初始化为null
    val str = new Array[String](8)
    println(str)

    val str2 = Array("Hello", "World")
    println("str2=" + str2)
    str2(0) = "Goodbye";

    println("str2=" + str2)

  }

  /**
    * 3.2 可变长数组
    */
  def testDynamicArray(): Unit = {
    val b = ArrayBuffer[Int]()
    val c = new ArrayBuffer[Int]
    // 一个空的数组缓冲，准备存放整数
    b += 1
    // 尾端添加元素
    b += (1, 2, 3, 5)
    printf("size=%d\n", b.length);
    // ArrayBuffer(1)
    // 在尾端添加任何集合
    b ++= Array(6, 7, 8, 9, 10)
    printf("size=%d\n", b.length);
    b.trimEnd(2)
    printf("size=%d\n", b.length);

    b.insert(2, 20, 21, 22)
    printf("inserted size=%d\n", b.length);
    b.remove(2, 2)
    printf("removed size=%d\n", b.length);

    // 将数组转成一个数组缓冲
    val arr = b.toArray[Int];

  }

  /**
    * 3.3 遍历数组和数组缓冲
    */
  def testIterateArray(): Unit = {
    val a = Array(1, 2, 3, 4, 5, 6, 7, 8)
    for (i <- 0 until a.length) println(i + ": " + a(i))
    for (elem <- a) println("elem=" + elem);
    for (i <- 0 until(a.length, 2)) println(i + ": " + a(i))
    for (i <- (0 until a.length).reverse) println(i + ": " + a(i))

    for (elem <- a if elem % 2 == 0) yield 2 * elem;

    val b = a.filter(_ % 2 == 0).map((2 * _))
    for (elem <- b) println("elem=" + elem);

  }


}
