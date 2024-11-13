fun main() {
// Задача 1
    val amount = 10000

    var commission:Int = (amount * 0.0075).toInt()

    if (commission < 35) {
        commission = 35
    }
    println("Размер комиссии: $commission руб.")


// Задача 2
    val likes = 42

    var text = ""

    if (likes % 10 == 1 && likes % 100 != 11) {
        text = "$likes человеку"
    } else if (likes % 10 in 2..4 && likes % 100 !in 12..14) {
        text = "$likes людям"
    } else {
        text = "$likes людям"
    }
    println("Понравилось $text")


// Задача 3
    val totalAmount = 15000
    val isRegularCustomer: Boolean = true

    var finalPrice = totalAmount.toDouble()

    if (totalAmount in 1001..10000) {
        finalPrice -= 100
    } else if (totalAmount > 10000) {
        finalPrice *= 0.95
    }

    if (isRegularCustomer) {
        finalPrice *= 0.99
    }

    val finalPriceRoundUp = Math.round(finalPrice)

    println("Итоговая цена покупки: $finalPriceRoundUp рублей.")
}
