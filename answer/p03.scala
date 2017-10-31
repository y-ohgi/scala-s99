/***
 * P03 (*) Find the Kth element of a list.
 * By convention, the first element in the list is element 0.
 * Example:
 * 
 * scala> nth(2, List(1, 1, 2, 3, 5, 8))
 * res0: Int = 2
 */

// def nth(idx :Int, ary: List[Int]): Int = {
//   if(0 >= idx || idx <= ary.size ) new Exception("illegal argument")
//   ary(idx)
// }


def nth[A](idx :Int, ary: List[Int], current :Int = 0): Int = ary match {
  case h :: tail if idx == current => h
  case h :: tail                   => nth(idx, tail, current+1)
  case _                           => throw new NoSuchElementException
}

val res = nth(2, List(1, 1, 2, 3, 5, 8))
println( res )
