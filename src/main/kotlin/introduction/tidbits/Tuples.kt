package introduction.tidbits

import introduction.classes.CustomerKotlin

fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair("Madrid", 2300000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("Madrid", "Europe", 2300000)
}

fun main(args: Array<String>) {
    val result = capitalAndPopulation("Madrid")
    result.first


    val countryInfo = countryInformation("Madrid")
    countryInfo.third


    println("-----------------------------------")

    // Destructuring


    // Calls component1, component2 and component3
    // Components signified the position
    val (capital, continent, population) = countryInformation("Madrid")
    println(capital)
    println(continent)
    println(population)

    println("-------------------------------------")

    // Destructuring data introduction.classes
    val (id, name, email) = CustomerKotlin(1, "Max", "max@gmail.com")
    println(id)
    println(name)
    println(email)

    println("-------------------------------------")

    // Destructuring in for loops
    val listCapitalsAndCounties = listOf(Pair("Madrid", "Spain"), "Paris" to "France")
    for ((capital, country) in listCapitalsAndCounties) {
        println("$capital - $country")
    }

}