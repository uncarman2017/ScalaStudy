package org.redmaple.scala.study1.exercise5

object CounterTest {
  def main(args: Array[String]): Unit = {
    val myCounter = new Counter
    myCounter.increment();
    println(myCounter.current)

    println(myCounter.age);
    myCounter.age_(42);
    println(myCounter.age);
    println(myCounter.timeStamp);

    myCounter.setName("麦麦和侠胆大白狮");
    println(myCounter.getName);

  }
}
