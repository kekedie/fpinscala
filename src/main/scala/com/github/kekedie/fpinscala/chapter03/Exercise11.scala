package com.github.kekedie.fpinscala.chapter03

import fpinscala.datastructures.{List, Nil}
import fpinscala.datastructures.List._

/**
 * @author Han Sangwon
 */
object Exercise11 extends App {

  println(sum3(List(1, 2, 3, 4, 5)))
  println(sum3(Nil))

  println(product3(List(1, 2, 3, 4, 5)))
  println(product3(Nil))

  println(length3(List(1, 2, 3, 4, 5)))
  println(length3(Nil))

}
