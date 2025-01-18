```groovy
def myMethod(Map params) {
  if (params != null) {
    params.each { key, value ->
      println "Key: $key, Value: $value"
    }
  } else {
    println "The map is null"
  }
}

myMethod(null)
myMethod([name: "John", age: 30])
```