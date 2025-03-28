val dailyLimit = 150_000
val monthLimit = 600_000

fun main() {
    //MasterCard, Visa, Mir
    val cardType = "MasterCard"
    val transfer = 79_000
    var transferInMonth = 0

    if (algoritmRascheta(cardType,transfer,transferInMonth) < 0) {
        println("Операция невозможна. Превышен Лимит.")
    }else {
        transferInMonth += transfer + algoritmRascheta("MasterCard",transfer,0)
        println("Комиссия = " + (transferInMonth - transfer))
    }




    println("spends in month = " + transferInMonth)


}


fun algoritmRascheta(cardType: String, transfer: Int, transferInMonth: Int): Int {
    when(cardType) {
        "MasterCard" -> if ((transfer > dailyLimit
//                    || transferInMonth > monthLimit
                    || (transfer + transferInMonth) > monthLimit) ){
            return -1
        }else if ((transfer) < 75_000 || (transferInMonth + transfer) < 75_000) {
            return 0
        }else if (transferInMonth > 75_000){
            return ((transfer * 0.006) + 20).toInt()
        }else{
            return if (transferInMonth < 75_000 && (transferInMonth + transfer) > 75_000){
                return ((((transferInMonth + transfer) - 75_000)* 0.006) + 20).toInt()
            }else{
                return (((transfer - 75_000)* 0.006) + 20).toInt()
            }
        }
        "Visa" -> if ((transfer > dailyLimit
//                    || transferInMonth > monthLimit
                    || (transfer + transferInMonth) > monthLimit)){
            return -1
        }else{
            if ((transfer * 0.0075) < 35){
                return 35
            }else{
                return (transfer * 0.0075).toInt()
            }
        }
        //Mir
        else -> if ((transfer > dailyLimit
//                    || transferInMonth > monthLimit
                    || (transfer + transferInMonth) > monthLimit)){
            return -1
        }else{
            return 0
        }
    }
}