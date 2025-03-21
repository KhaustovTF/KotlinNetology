fun main() {
    val likes = 32547
    val ludyam = "людям."
    val cheloveku = "человеку"
    var str = "Понравилось $likes "
    if (likes % 10 == 1 && likes != 11 ) {
        println(str + cheloveku)
    } else if (likes == 11 ){
        println(str + ludyam)
    } else{
        println(str + ludyam)
    }

}