package com.github.kekedie.fpinscala.chapter03

import fpinscala.datastructures.List
/**
 * @author Han Sangwon
 */
object Exercise05 extends App {

  val list = List(1, 2, 3, 4, 5)
  println(List.dropWhile(list)(_ != 4))
  println(list)

}
