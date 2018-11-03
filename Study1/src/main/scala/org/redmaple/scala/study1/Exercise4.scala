package org.redmaple.scala.study1

import java.awt.font.TextAttribute._

import scala.collection.JavaConverters.{mapAsJavaMap, mapAsScalaMap, propertiesAsScalaMap};

/**
  * 第四章：映射和元组
  */
object Exercise4 {
  def main(args: Array[String]): Unit = {
    println("=============================4.1 构造映射===============================")
    testMapping()
    println("=============================4.2 获取映射中的值==============================")
    testMappingItem()
    println("=============================4.3 更新映射中的值==============================")
    testUpdMappingItem()
    println("=============================4.4 迭代映射==============================")
    testIterationMapping()
    println("=============================4.5 已排序映射==============================")
    testSortedMapping()
    println("=============================4.6 与Java的互操作==============================")
    testTreeMap()
    println("=============================4.7 元组==============================")
    testTuple()
    println("=============================4.8 拉链操作==============================")
    testZipper()
  }

  /**
    * 4.1 构造映射
    */
  def testMapping(): Unit = {
    //构建不变映射对象
    val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8);
    scores.foreach(println)
    //构建可变映射对象
    val scores2 = collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8);
    scores2.foreach(println)
    // 从一个空的映射开始构建一个新的映射
    val scores3 = new collection.mutable.HashMap[String, Int];
    scores3.foreach(println)
    // 另一种构建映射的方式
    val scores4 = Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))
    scores4.foreach(println);

  }

  /**
    * 4.2 获取映射中的值
    */
  def testMappingItem(): Unit = {
    val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8);
    var bobScore = scores.get("Bob"); // 返回一个option可选对象
    println("Bob's score is " + bobScore.get);
    var bobScore2 = scores.getOrElse("Bob", 100); // 返回一个option可选对象
    println("Bob's score is " + bobScore2.intValue());
  }


  /**
    * 4.3 更新映射中的值
    */
  def testUpdMappingItem(): Unit = {
    val scores = collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8);
    scores("Bob") = 10;
    scores.foreach(println);
    println()
    scores += ("Bob" -> 9, "Max" -> 10); // 会把已有的项目更新掉
    scores.foreach(println);
    println()
    scores -= ("Cindy"); // 会把已有的项目更新掉
    scores.foreach(println);
    println()
    val newScores = scores + ("Alice" -> 9, "Ken" -> 7);
    newScores.foreach(println);
    println()
  }

  /**
    * 4.4 迭代映射
    */
  def testIterationMapping(): Unit = {
    val scores = collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8);
    for ((k, v) <- scores) {
      printf("key=%s,value=%d\n", k, v);
    }

    println("key list");
    scores.keySet.foreach(k => print(k + " "));
    println("\nvalue list");
    scores.values.foreach(v => print(v + " "));

    val newScores = reverseMap(scores);
    println("\nnew scores");
    newScores.foreach(println);

  }


  def reverseMap(map: collection.mutable.Map[String, Int]): collection.mutable.Map[Int, String] = {
    for ((k, v) <- map) yield (v, k)
  }

  /**
    * 4.5 已排序映射
    */
  def testSortedMapping(): Unit = {
    val scores = collection.immutable.SortedMap("Bob" -> 3, "Cindy" -> 8, "Alice" -> 10);
    scores.foreach(println);

    val seqScores = collection.mutable.LinkedHashMap(1 -> "Max", 2 -> "Bill", 3 -> "Bob");
    seqScores.foreach(println);
  }

  /**
    * 4.6 与Java的互操作
    */
  def testTreeMap(): Unit = {
    val scores: scala.collection.mutable.Map[String, Int] = mapAsScalaMap(new java.util.TreeMap[String, Int]);
    val props: scala.collection.Map[String, String] = propertiesAsScalaMap(System.getProperties());
    props.foreach(println);

    val attrs = Map(FAMILY -> "Serif", SIZE -> 12);
    val font = new java.awt.Font(mapAsJavaMap(attrs));
    printf("Font Family is %s, size is %d\n", font.getFamily(), font.getSize());
  }

  /**
    * 4.7 元组
    */
  def testTuple(): Unit = {
    val tuple = (1, 3.1415, "Max Yu");
    printf("The elements of tuple is %d,%f,%s\n",tuple._1,tuple._2,tuple._3);

    println(tuple.getClass.getTypeName)
  }

  /**
    * 4.8 拉链
    */
  def testZipper(): Unit ={
    val symbols = Array("<", "-", ">")
    val counts = Array(2, 10, 2)
    val pairs = symbols.zip(counts);
    pairs.foreach(println)
  }
}
