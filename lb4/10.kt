fun main() {
    println("Выберите способ оплаты:")
    println("""
        1. Наличные
        2. Кредитная карта
        3. СБП
    """)

    val choice = readLine()

    when (choice) {
        "1" -> println("Вы выбрали оплату наличными. Пожалуйста, приготовьте наличку.")
        "2" -> println("Вы выбрали оплату кредитной картой. приготовьте карту.")
        "3" -> println("Вы выбрали оплату через СБП. Пожалуйста, зайдите в приложение.")
        else -> println("Некорректный выбор. Пожалуйста, выберите 1, 2 или 3.")
    }
}