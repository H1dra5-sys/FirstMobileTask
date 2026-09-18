class WorkingWithNumbers(var oneDimensionedArray: IntArray) {
    fun theSumOfPositiveNumbers() {
        var sum = 0

        for (number in oneDimensionedArray) {
            if (number > 0) {
                sum += number
            }
        }
        print("Sum: $sum")
        println()
    }

    fun theCompositionOfNumbers() {
        var composition = 1

        for (number in oneDimensionedArray) {
            composition *= number
        }
        print("Compositon: $composition")
        println()
    }

    fun arithmeticMean() {
        var sum = 0
        var arMean = 0

        for (number in oneDimensionedArray) {
            sum += number
        }
        arMean = sum / oneDimensionedArray.size
        print("Arithmetic mean: $arMean")
        println()
    }
}

fun main() {
    val workingWithAnArray = WorkingWithNumbers(intArrayOf(5, 23, 27, 3, 2))
    workingWithAnArray.theSumOfPositiveNumbers()
    workingWithAnArray.theCompositionOfNumbers()
    workingWithAnArray.arithmeticMean()
}