def penultimate(ary: List[Int]): Int = {
  if(ary.size < 2) new Exception("illegal argument")
  ary(ary.size - 2)
}

val res = penultimate(List(1, 1, 2, 3, 5, 8))
println( res )
