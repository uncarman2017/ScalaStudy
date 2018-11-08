package org.redmaple.scala.study1.exercise14

/**
  * 14.1 更好的switch
  */
object Test1 {
    def main(args: Array[String])={
      var sign = 0
      val ch = '-'
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ => sign = 0
      }

      printf("sign=%d",sign)
    }
}
