package com.github.kekedie.fpinscala.chapter02

/**
 * @author Han Sangwon
 */
object Exercise01 {

  def fib(n: Int): Int = {

    def go(n: Int, a: Int, b: Int): Int = n match {
      case 0 => a
      case _ => go(n-1, a+b, a)
    }

    go(n, 0, 1)

  }

}
