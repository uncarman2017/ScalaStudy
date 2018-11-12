package org.redmaple.scala.study1.exercise15

import com.sun.xml.internal.stream.Entity

import scala.annotation.elidable


@Entity
@Cloneable
class Test1 {

  def testSomeFeature(): Unit = {

  }

  def check(@NotNull password: String) ={

  }

  // 在生产代码中移除
  @elidable(500)
  def dump(props: Map[String,String]): Unit ={

  }

}
