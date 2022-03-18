fun main() {
    //Set<T> stores unique elements; their order is generally undefined.
    val numbers = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbers.size}")
    if (numbers.contains(1)) println("1 is in the set")
    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")
    //The default implementation of Set – LinkedHashSet – preserves the order of elements insertion
    println(numbers.first() == numbersBackwards.first())
    println(numbers.first() == numbersBackwards.last())
    val strings = hashSetOf("a", "b", "c", "c") //hash set value unik
    println("My Set Values are"+strings)
}