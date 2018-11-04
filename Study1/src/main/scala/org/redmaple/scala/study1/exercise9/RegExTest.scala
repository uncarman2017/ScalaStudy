package org.redmaple.scala.study1.exercise9

/**
  * 9.10 正则表达式
  */
object RegExTest {
  def main(args: Array[String]): Unit = {
    val numPattern = "[0-9]+".r
    for (matchString <- numPattern.findAllIn("99 bottles,98 bottles")) {
      println(matchString)
    }

  }
}
