package org.redmaple.scala.study1.exercise5

import scala.collection.mutable.ArrayBuffer

/**
  * 嵌套类
  */
class Network {
  class Member(val name: String){
    val contacts = new ArrayBuffer[Member]

  }

  private val members = new ArrayBuffer[Member];

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }


}
