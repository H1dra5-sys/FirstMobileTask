fun main(){
    var count = 0
    var total = 0
    var arithmeticMean = 0
    do {
        var number = readln().toInt()
        ++count
        total += number
    } while (number != 0)
    arithmeticMean = total / (count - 1)
    println("Количество введёных чисел: " + count)
    println("Сумма всех введёных чисел: " + total)
    println("Среднее арифмитическое введёных чисел: " + arithmeticMean)
}