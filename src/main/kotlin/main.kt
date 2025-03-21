fun main() {
    val ItemPrice = 100
    val ItemCount: Int = 11
    val discount = 100
    val discountStart = 1_000

    val totalPrice = ItemPrice * ItemCount
    val result = if (totalPrice > discountStart) {
        totalPrice - discount
    } else {
        totalPrice
    }

    println(result)
}