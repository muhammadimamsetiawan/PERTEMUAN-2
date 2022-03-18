fun main(){
    //Map<K, V> is not an inheritor of the Collection interface;
    /*
    Map stores key-value pairs (or entries);
    keys are unique, but different keys can be paired with equal values.
    */
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("The value 1 is in the map")
    if (numbersMap.containsValue(1)) println("The value 1 is in the map") // same as previous
    //wo maps containing the equal pairs are equal regardless of the pair order.
    val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)
    println("The maps are equal: ${numbersMap == anotherMap}")
    //MutableMap is a Map with map write operations, for example,
    //you can add a new key-value pair or update the value associated with the given key
    val mutableMap = mutableMapOf("one" to 1, "two" to 2)
    mutableMap.put("three", 3)
    mutableMap["one"] = 11
    println(mutableMap)
    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"]) // prints "1"
}