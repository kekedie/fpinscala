package com.github.kekedie.fpinscala.chapter02

import org.specs2.mutable.Specification

/**
 * @author Han Sangwon
 */
class Exercise01Spec extends Specification {

  "fib" should {

    "be 0 with 0" in {
      Exercise01.fib(0) mustEqual 0
    }
    "be 1 with 1" in {
      Exercise01.fib(1) mustEqual 1
    }
    "be 1 with 2" in {
      Exercise01.fib(2) mustEqual 1
    }
    "be 2 with 3" in {
      Exercise01.fib(3) mustEqual 2
    }
    "be 3 with 4" in {
      Exercise01.fib(4) mustEqual 3
    }
    "be 5 with 5" in {
      Exercise01.fib(5) mustEqual 5
    }

  }

}
