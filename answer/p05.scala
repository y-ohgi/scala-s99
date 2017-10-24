def reverse(ary :List[Int]): List[Int] = {
  var res:List[Int] = List[Int]()
  ary.foreach { num =>  res = num::res}

  res
}


val res = reverse(List(1, 1, 2, 3, 5, 8))
println(res)
