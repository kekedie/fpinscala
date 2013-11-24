package com.github.kekedie.fpinscala.chapter03

import fpinscala.datastructures.{Cons, List, Nil}
import fpinscala.datastructures.List._

/**
 * @author Han Sangwon
 */
object Exercise08 extends App {

  println(foldRight(List(1, 2, 3), Nil: List[Int])(Cons(_, _)))

}
