package com.github.kekedie.fpinscala.chapter03

import fpinscala.datastructures.List

/**
 * @author Han Sangwon
 */
object Exercise03 extends App {

  val list: List[String] = List("a", "b", "c")

  println(List.setHead("d", list))
  println(list)

}
