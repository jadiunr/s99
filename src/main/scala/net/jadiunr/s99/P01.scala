package net.jadiunr.s99

object P01 {
  // こっちでいいやん
  def last[A](list: List[A]): A = list.last

  // Recursive
  def lastRecursive[A](list: List[A]): A = list match {
    case x :: Nil => x
    case x :: xs => lastRecursive(xs)
    case _ => throw new NoSuchElementException
  }
}
