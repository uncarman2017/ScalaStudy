package org.redmaple.scala.study1.exercise9

import java.io.PrintWriter

/**
  * 9.6 写入文本文件
  */
object FileWriter1 {
  def main(args: Array[String]): Unit = {
    println("=====================9.6 写入文本文件=====================")
    val out = new PrintWriter("E:\\github\\scala\\ScalaStudy\\Study1\\src\\main\\resources\\numbers.txt")
    for(i <- 1 to 100)out.println(i)
    out.close()
  }
}
