def last(ary: List[Int]): Int = {
  if(ary.size == 0) throw new Exception("illegal argument")
  ary(ary.size - 1)
}

val res = last(List(1, 1, 2, 3, 5, 8))

println( res )


