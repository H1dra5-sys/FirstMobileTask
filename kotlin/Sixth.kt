fun firstFor() {
    val numberArray = intArrayOf(7, 34, 64, 12, 10, 5)
    var multiplier = 1
    var min = 100000
    var max = -10000

    for (element in numberArray) {
        multiplier = multiplier * element
        if (element > max) {
            max = element
        } else if (element < min) {
            min = element
        }
        println("Multiply:$multiplier, Min:$min, Max:$max ")
    }
}

fun secondWhile() {
    val numberArray = intArrayOf(7, 34, 64, 12, 10, 5)
    var counter = 0
    var multiplier = 1
    var min = 100000
    var max = -10000

    while (counter < numberArray.size) {
        multiplier = multiplier * numberArray[counter]
        if (numberArray[counter] > max) {
            max = numberArray[counter]
        } else if (numberArray[counter] < min) {
            min = numberArray[counter]
        }
        counter++
        println("Multiply:$multiplier, Min:$min, Max:$max ")
    }
}

fun thirdForEach() {
    val numberArray = intArrayOf(7, 34, 64, 12, 10, 5)
    var multiplier = 1
    var min = 100000
    var max = -10000

    numberArray.forEach{multiplier = multiplier * it}

    numberArray.forEach{if (it > max) {
                            max = it
                        }
    }

    numberArray.forEach{if (it < min) {
                            min = it
                        }
    }

    println("Multiply:$multiplier, Min:$min, Max:$max ")
}

fun fifthResuce() {
    val numberArray = intArrayOf(7, 34, 64, 12, 10, 5)
    var multiplier = 1
    var min = 100000
    var max = -10000

    multiplier = numberArray.reduce { composition, element -> composition * element }
    min = numberArray.reduce {min, element -> if (min > element) element else min}
    max = numberArray.reduce { max, element -> if (max < element) element else max }
    println("Multiply: $multiplier, Min: $min, Max: $max")
}

fun sixthMinMax() {
    val numberArray = intArrayOf(7, 34, 64, 12, 10, 5)
    println("Min:${numberArray.min()}, Max:${numberArray.max()}")
}

fun main() {
    sixthMinMax()
}