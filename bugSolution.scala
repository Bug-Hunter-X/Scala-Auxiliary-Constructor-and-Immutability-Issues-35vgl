```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
}

val obj = new MyClass()
println(obj.x) // Output: 0

val obj2 = new MyClass(5)
println(obj2.x) // Output: 5

//Solution
val arr = Array(1,2,3,4)
val res = arr.map(x=> new MyClass(x))

res.foreach(x=>println(x.x))
```