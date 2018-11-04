package org.redmaple.scala.study1.exercise9

import scala.io.Source;

/**
  * 9.1 读取行
  */
object FileReader1 {

  def main(args: Array[String]): Unit = {
    println("=====================9.1 读取行=====================")
    readLines()
    readLines2()
    readLine3()
  }

  def readLines(): Unit = {
    val source = Source.fromFile("E:\\github\\scala\\ScalaStudy\\Study1\\src\\main\\resources\\file1.txt", "UTF-8")
    val lineIterator = source.getLines()
    for (line <- lineIterator) println(line)


  }

  def readLines2() = {
    val source = Source.fromFile("E:\\github\\scala\\ScalaStudy\\Study1\\src\\main\\resources\\file1.txt", "UTF-8")
    val lineIterator = source.getLines()
    lineIterator.toArray.foreach(println)
  }

  def readLine3() = {
    val source = Source.fromFile("E:\\github\\scala\\ScalaStudy\\Study1\\src\\main\\resources\\file1.txt", "UTF-8")
    println(source.mkString)
  }



}
