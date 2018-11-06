package org.redmaple.scala.study1.exercise11

/**
  * unapplySeq方法
  */
object Name {
  def unapplySeq(input: String): Option[Seq[String]] = {
    if(input.trim == "") None else Some(input.trim.split("\\s+"))
  }
}
