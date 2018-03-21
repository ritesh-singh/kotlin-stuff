package tidbits

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
}