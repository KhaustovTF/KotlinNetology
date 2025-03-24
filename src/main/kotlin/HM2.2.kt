fun main() {
    val likes = 21000121
    val ludyam = "людям."
    val cheloveku = "человеку"
    var str = "Понравилось $likes "
    if (likes % 100 != 11 && likes != 11 ) {
        println(str + cheloveku)
    } else if (likes == 11){
        println(str + ludyam)
    } else{
        println(str + ludyam)
    }

}