def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) = {
    println("lteqgt")
    (values.filter(_ < v).length, values.filter(_ == v).length, values.filter(_ > v).length)
}

val a = lteqgt(Array(1, 2, 3, 4 ,5, 6, 7, 8, 9, 10), 5)
println(a)
