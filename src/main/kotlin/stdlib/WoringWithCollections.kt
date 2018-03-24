package stdlib

import java.util.*

fun main(args: Array<String>) {

    // By default it creates IMutable List, read only

    val cities = listOf("Madrid", "London", "Paris")

    //javaClass - the actual type to which it belongs
    println(cities.javaClass)

    var emptyList = emptyList<String>()
    println(emptyList.javaClass)


    var arrayList = Arrays.asList("Madrid", "London")
    println(arrayList.javaClass)


    println("-----------------------------")

    // Creating Mutable List

    val mutableCities = mutableListOf("Madrid")
    mutableCities.add("London")

    val hashMap = hashMapOf(Pair("Madrid", "Spain"), Pair("Paris", "France"))

    // Arrays of primitives
    val boolean = booleanArrayOf(true, false, true)
    val characters = charArrayOf('A', 'B', 'C')


}