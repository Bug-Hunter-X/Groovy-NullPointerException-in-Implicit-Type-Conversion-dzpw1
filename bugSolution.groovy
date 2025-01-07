```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    throw new IllegalArgumentException("Input values cannot be null")
  }
  return a + b
}

println myMethod(1, 2) // 3

try {
  println myMethod(null, 2) 
} catch (IllegalArgumentException e) {
  println "Exception caught: "+ e.message
}

try {
  println myMethod(1, null) 
} catch (IllegalArgumentException e) {
  println "Exception caught: "+ e.message
}

try {
  println myMethod(null, null) 
} catch (IllegalArgumentException e) {
  println "Exception caught: "+ e.message
}
```