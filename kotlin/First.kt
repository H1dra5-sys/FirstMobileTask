fun main() {
    print("Input number: ")
    val number = readln()
    val firstDigit = (number.first()).toString().toInt()
    val lastDigit = (number.last()).toString().toInt()
    val sumOfDigit = firstDigit + lastDigit
    println("Sum last + first digit = $sumOfDigit")
}