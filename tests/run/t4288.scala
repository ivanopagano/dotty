object Test {
  def f1 = scala.collection.mutable.ListBuffer(1 to 9*).slice(-5, -1)
  def f2 = List(1 to 9*).slice(-5, -1)
  def f3 = Vector(1 to 9*).slice(-5, -1)
  def f4 = Iterable(1 to 9*).slice(-5, -1)
  def f5 = (1 to 9).toArray.slice(-5, -1)
  def f6 = LazyList.from(1 to 9).slice(-5, -1)
  def f7 = (1 to 9).slice(-5, -1)

  def main(args: Array[String]): Unit = {
    List[Iterable[Int]](f1, f2, f3, f4, f5, f6, f7) foreach (x => assert(x.isEmpty, x))
  }
}
