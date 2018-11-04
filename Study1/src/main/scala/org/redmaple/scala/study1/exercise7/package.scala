package org.redmaple.scala.study1

/**
  * 7.5 包对象
  */
package object people {
  val defaultName = "Max Yu's public repositary"
}

package people {

  class Person {
    var name = defaultName
  }

}
