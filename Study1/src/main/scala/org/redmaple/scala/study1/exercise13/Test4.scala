package org.redmaple.scala.study1.exercise13

/**
  * 13.11 拉链操作
  */
object Test4 {
  def main(args: Array[String]): Unit = {
    val lst = List(5.0, 20.0, 9.95).zipAll(List(10, 2), 0.0, 1)
    lst.foreach(println)

    // zipWithIndex方法返回对偶的列表，其中每个对偶中第二个组成部分是每个元素的下标
    val vector = "Scala".zipWithIndex
    vector.foreach(println)
  }
}
