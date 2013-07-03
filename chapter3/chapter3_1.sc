def makeArray(size: Int): Array[Int] = {
  new Array[Int](size)
}

var tempArray = makeArray(5)
println("array length : " + tempArray.length)