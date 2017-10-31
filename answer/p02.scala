// def penultimate(ary: List[Int]): Int = {
//   if(ary.size < 2) new Exception("illegal argument")
//   ary(ary.size - 2)
// }

def penultimate[A](ls: List[A]): A = ls match {
  case h :: _ :: Nil  => h
  case _ :: _ :: tail => penultimate(tail)
  case _              => throw new NoSuchElementException
}


val res = penultimate(List(1, 1, 2, 3, 5, 8))
println( res )
