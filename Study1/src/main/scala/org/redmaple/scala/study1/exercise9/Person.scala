package org.redmaple.scala.study1.exercise9

import scala.beans.BeanProperty
import java.io._

@SerialVersionUID(42)
class Person extends Serializable {

  @BeanProperty
  var name: String = "Max Yu"


  @BeanProperty
  var age: Int = 41;



}



