val a = Array(1, 2, 3, 4, 5)
var temp = 0
for (i <- 1 until (a.length, 2)) {
  temp = a(i)
  a(i) = a(i - 1)
  a(i - 1) = temp
}
