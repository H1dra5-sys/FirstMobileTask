fun firstFor() {
    val numberArray = intArrayOf(72, 25, 31, 29, 5, 82, 71, 23, 162, 8271, 234, 1, 89, 11, 72, 982, 71)
    for (element in 1 until numberArray.size - 1) {
        if (numberArray[element] > numberArray[element + 1] && numberArray[element] > numberArray[element - 1]) {
            println(numberArray[element])
        }
    }
}

fun secondWhile() {
    val numberArray = intArrayOf(72, 25, 31, 29, 5, 82, 71, 23, 162, 8271, 234, 1, 89, 11, 72, 982, 71)
    var count = numberArray.size - 1
    var border = 1
    while (count > 0) {
        if (border != numberArray[numberArray.size - 1]) {}
            if (numberArray[border] > numberArray[border - 1] && numberArray[border] > numberArray[border + 1]) {
                println(numberArray[border])
        }
        border += 1
        count -= 1
    }
}

fun thirdForEach() {
    val numberArray = intArrayOf(72, 25, 31, 29, 5, 82, 75, 23, 162, 8271, 234, 1, 89, 11, 73, 982, 71)
    numberArray.forEachIndexed {index, value ->  if (numberArray.indexOf(value) != 0 && numberArray.indexOf(value) != numberArray.lastIndex) {
                            if (numberArray[index] > numberArray[index - 1] && numberArray[index] > numberArray[index + 1]) {
                                println(value)
                            }
                        }
    }
}

fun main() {
    firstFor()
    secondWhile()
    thirdForEach()
}