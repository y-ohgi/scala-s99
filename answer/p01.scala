def last(ary: List[Int]): Int = {
  // sizeはListだと再帰的に取得しにいくため重い。
  // if(ary.size == 0) throw new Exception("illegal argument")
  if(ary.isEmpty) throw new Exception("illegal argument") // 例外を投げるより、Optionを返したほうが良い

  ary(ary.size - 1)
}

val res = last(List(1, 1, 2, 3, 5, 8))

println( res )


