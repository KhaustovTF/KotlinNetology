fun main() {
    val amount = 1000
    val commision = 0.75
    var resultCommision = (amount * commision) / 100
    if (resultCommision < 35) {
        resultCommision = 35.0
    }
    println(resultCommision)
}