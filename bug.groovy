```groovy
def myMethod(Map params) {
  params.each { key, value ->
    println "Key: $key, Value: $value"
  }
}

myMethod(null)
```