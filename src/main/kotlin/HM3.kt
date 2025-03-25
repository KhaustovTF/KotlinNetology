fun main() {
    val whenHeWas = 2427190//seconds
    agoToText(whenHeWas)

}

fun agoToText(whenHeWas: Int) {
    when(whenHeWas) {
        in 0 .. 60 -> println("был(а) только что")
        in 61 ..< (60 * 60) -> println("был(а) ${whenHeWas/60} ${minuteTextChanger(whenHeWas)}")
        in (60*60+1) .. (24 * 60 * 60) -> println("был(а) ${whenHeWas/3600} ${hourTextCanger(whenHeWas)}")
        in 86400..<(86400*2) -> println("был(а) вчера")
        in (86400*2) ..< (86400*3) -> println("был(а) позавчера")
        else -> println("был(а) давно")
    }
}

fun minuteTextChanger(whenHeWas: Int): String {
    return when(whenHeWas/60){
        1 , 21 , 31 , 41 , 51 -> "минуту назад"
        2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> "минуты назад"
        else -> "минут назад"
    }
}

fun hourTextCanger(whenHeWas: Int): String {
    return when(whenHeWas/3600) {
        1, 21 -> "час назад"
        2, 3, 4, 22, 23, 24 -> "часа назад"
        else -> "часов назад"
    }
}