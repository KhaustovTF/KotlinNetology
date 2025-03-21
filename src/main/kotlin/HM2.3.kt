fun main() {
    val VipClient = true
    val spendsOnMusic = 15_000
    val discount = 100 // rubley
    val VipDiscount = 0.95 // procentov
    val VipClientDiscount = 0.01
    var resultDiscount: Double

    if (spendsOnMusic >= 1_001 && spendsOnMusic <= 10_000 && VipClient == true) {
        resultDiscount = ((spendsOnMusic - discount).toDouble())
        println(resultDiscount - (resultDiscount * VipClientDiscount))
    } else if (spendsOnMusic >= 1_001 && spendsOnMusic <= 10_000) {
        resultDiscount = (spendsOnMusic - discount).toDouble()
        println(resultDiscount)
    } else if (spendsOnMusic >= 10_001 && VipClient == true){
        resultDiscount = spendsOnMusic * VipDiscount
        println(resultDiscount - (resultDiscount * VipClientDiscount))
    }else if (spendsOnMusic >= 10_001){
        resultDiscount = spendsOnMusic * VipDiscount
        println(resultDiscount)
    }else{
        println(spendsOnMusic)
    }
}