package fpinscala.datastructures

/**
 * @author Han Sangwon
 */
sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {

  def reverse[A](l: List[A]): List[A] =
    foldLeft(l, Nil: List[A])((z, h) => Cons(h, z))

  def length3[A](l: List[A]): Int =
    foldLeft(l, 0)((z, h) => z + 1)

  def sum3(l: List[Int]) =
    foldLeft(l, 0)(_ + _)

  def product3(l: List[Double]) =
    foldLeft(l, 1.0)(_ * _)

  def length[A](l: List[A]): Int =
    foldRight(l, 0)((t, z) => z + 1)

  def sum2(l: List[Int]) =
    foldRight(l, 0)((x, y) => x + y)

  def product2(l: List[Double]) =
    foldRight(l, 1.0)(_ * _)

  def init[A](l: List[A]): List[A] = {
    l match {
      case Nil => Nil
      case Cons(_, Nil) => Nil
      case Cons(h, t) => Cons(h, init(t))
    }
  }

  def foldLeft[A, B](l: List[A], z: B)(f: (B, A) => B): B =
    l match {
      case Nil => z
      case Cons(h, t) => foldLeft(t, f(z, h))(f)
    }

  def foldRight[A, B](l: List[A], z: B)(f: (A, B) => B): B =
    l match {
      case Nil => z
      case Cons(h, t) => f(h, foldRight(t, z)(f))
    }

  def append[A](a1: List[A], a2: List[A]): List[A] =
    a1 match {
      case Nil => a2
      case Cons(h, t) => Cons(h, append(t, a2))
    }

  def append2[A](l: List[A], r: List[A]): List[A] =
    foldRight(l, r)(Cons(_, _))

  def dropWhile[A](l: List[A])(f: A => Boolean): List[A] = {
    l match {
      case Cons(h, t) if f(h) => dropWhile(t)(f)
      case _ => l
    }
  }

  def drop[A](l: List[A], n: Int): List[A] = {
    if (n <= 0) l
    else l match {
      case Nil => Nil
      case Cons(_, t) => drop(t, n-1)
    }
  }

  def setHead[A](a: A, l: List[A]) = l match {
    case Nil => Nil: List[A]
    case Cons(_, t) => Cons(a, t)
  }

  def tail[A](l: List[A]): List[A] = l match {
    case Nil => Nil: List[A]
    case Cons(_, t) => t
  }

  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(h, t) => h + sum(t)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1.0
    case Cons(0, _) => 0.0
    case Cons(h, t) => h * product(t)
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))

}

