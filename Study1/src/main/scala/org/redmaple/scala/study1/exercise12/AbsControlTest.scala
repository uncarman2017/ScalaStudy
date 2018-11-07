package org.redmaple.scala.study1.exercise12

/**
  * @author Max Yu
  * @version 创建时间：2018/11/7 10:23
  * 12.9 控制抽象
  */
object AbsControlTest {
  def runInThread(block: => Unit): Unit = {
    new Thread {
      override def run() {
        block
      }
    }.start()
  }

  def main(args: Array[String]): Unit = {
    runInThread {
      println("Hi");
      Thread.sleep(3000)
      println("Bye")
    }
  }
}
