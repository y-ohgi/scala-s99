def nth(idx :Int, ary: List[Int]): Int = {
  if(0 >= idx || idx <= ary.size ) new Exception("illegal argument")
  ary(idx)
}

val res = nth(2, List(1, 1, 2, 3, 5, 8))
println( res )
