package org.redmaple.scala.study1.exercise8

/**
  * 8.3 类型检查和转换
  */
object EmployeeTest {
  def main(args: Array[String]): Unit = {
    var person = new Person;
    var emp = new Employee;
    if (emp.isInstanceOf[Person]) {
      println("emp is instance of Person")
      val emp2 = emp.asInstanceOf[Employee]
    }
    if (emp.getClass == classOf[Employee]) {
      println("emp is class of Employee")
    }

    emp match {
      case s: Employee => {
        println("emp is employee");
        println(s.toString)

      }
      case _ => println("emp is not employee")
    }
  }
}
