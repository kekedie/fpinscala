package com.github.kekedie.fpinscala.chapter02

import com.typesafe.scalalogging.slf4j.Logging

/**
 * @author Han Sangwon
 */
object Exercise02 extends Logging {

  def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean = {

    def go(as: Array[A], index: Int): Boolean = {
      logger.debug("as: {}, index: {}", as.toSeq, index.toString)
      if (as.length < 2) false
      else if (gt(as(index-1), as(index))) {
        if (index > 1) {
          go(as, index-1)
        } else {
          true
        }
      } else {
        false
      }
    }

    go(as, as.length-1)
  }

}
