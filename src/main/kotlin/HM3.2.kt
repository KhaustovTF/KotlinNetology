fun main() {
    //MasterCard, Visa, Mir
    val cardType = "MasterCard"
    val transfer = 150_000
    var transferInMonth = 0
    val dailyLimit = 150_000
    val monthLimit = 600_000

    var commission = if (transfer > dailyLimit || (transfer + transferInMonth)> monthLimit) {
        println("Операция заблокирована")
    }else{

        transferInMonth += transfer + algoritmRascheta(cardType,transfer,transferInMonth)
    }

    println(commission)
    println(transferInMonth)


}


fun algoritmRascheta(cardType: String, transfer: Int, transferInMonth: Int): Int {
    when(cardType) {
        "MasterCard" -> if (transferInMonth >= 75_000){

            return (transfer * 0.006 + 20).toInt()
        }else if (transferInMonth == 0 && transfer <= 150_000){
            return ((transfer - 75_000) * 0.006 + 20).toInt()
        }
        else{
            return 0
        }
        "Visa" -> if ((transfer* 0.0075 < 35)){
            return transfer - 35
        }else{
            return (transfer * 0.0075).toInt()
        }
        else -> return transfer
    }
    return 0
}