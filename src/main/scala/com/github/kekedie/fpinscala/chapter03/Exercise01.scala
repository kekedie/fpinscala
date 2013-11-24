package com.github.kekedie.fpinscala.chapter03

import fpinscala.datastructures.Cons
import fpinscala.datastructures.List
import fpinscala.datastructures.Nil

/**
 * @author Han Sangwon
 */
object Exercise01 extends App {

  val x = List(1, 2, 3, 4, 5) match {
    case Cons(x, Cons(2, Cons(4, _))) => x
    case Nil => 42
    case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
    case Cons(h, t) => h + List.sum(t)
    case _ => 101
  }

  println(x)

}
