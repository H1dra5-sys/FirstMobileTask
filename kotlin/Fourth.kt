fun main() {
    val n = 100
    for (number in 2 .. n) {
        if (number < 10) {
            if (number == 2 || number == 3 || number == 5 || number == 7) {
                println(number)
            }
        }

        if (number > 10) {
            if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
                println(number)
            }
        }
    }
}