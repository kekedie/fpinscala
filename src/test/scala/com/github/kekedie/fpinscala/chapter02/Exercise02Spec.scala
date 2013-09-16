package com.github.kekedie.fpinscala.chapter02

import org.specs2.mutable.Specification

/**
 * @author Han Sangwon
 */
class Exercise02Spec extends Specification {

  def intCompare = (x: Int, y: Int) => x < y

  "isSorted with '(x: Int, y: Int) => x < y'" should {

    "be true with [1, 2, 3]" in {
      Exercise02.isSorted[Int](Array(1, 2, 3), intCompare) mustEqual true
    }
    "be false with single element" in {
      Exercise02.isSorted[Int](Array(1), intCompare) mustEqual false
    }
    "be false with [1, 2, 3, 1]" in {
      Exercise02.isSorted[Int](Array(1, 2, 3, 1), intCompare) mustEqual false
    }
    "be false with [3, 1, 2, 3]" in {
      Exercise02.isSorted[Int](Array(3, 1, 2, 3), intCompare) mustEqual false
    }
    "be false with [1, 2, 1, 3]" in {
      Exercise02.isSorted[Int](Array(1, 2, 1, 3), intCompare) mustEqual false
    }

  }

}
