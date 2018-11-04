package org.redmaple.scala.study1.exercise7

package horstmann {

  object Util {
    def percentOf(value: Double, rate: Double) = value * rate / 100
  }

  package impatient {

    class Employee {
      private var salary: Double = 800000.0;

      def giveRaise(rate: Double): Unit = {
        salary += Util.percentOf(salary, rate)
      }
    }

  }

}
