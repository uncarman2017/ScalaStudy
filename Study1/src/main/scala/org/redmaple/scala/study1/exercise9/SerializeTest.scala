package org.redmaple.scala.study1.exercise9

import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}

/**
  * 9.8 序列化
  */
object SerializeTest {
  def main(args: Array[String]): Unit = {
    val person = new Person;
    val out = new ObjectOutputStream(new FileOutputStream("E:\\github\\scala\\ScalaStudy\\Study1\\build\\tmp\\test.obj"))
    out.writeObject(person)
    out.close()
    val in = new ObjectInputStream(new FileInputStream("E:\\github\\scala\\ScalaStudy\\Study1\\build\\tmp\\test.obj"))
    val savedPerson = in.readObject().asInstanceOf[Person]
    printf("age=%d,name=%s", savedPerson.getAge, savedPerson.getName)
  }
}
