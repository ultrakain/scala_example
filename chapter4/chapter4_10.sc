scala> "Hello".zip("World")
res0: scala.collection.immutable.IndexedSeq[(Char, Char)] = Vector((H,W), (e,o), (l,r), (l,l), (o,d))

scala> "Hello".zip("WorldSeoul")
res1: scala.collection.immutable.IndexedSeq[(Char, Char)] = Vector((H,W), (e,o), (l,r), (l,l), (o,d))

scala> "Hello".zip("Wo")
res2: scala.collection.immutable.IndexedSeq[(Char, Char)] = Vector((H,W), (e,o))