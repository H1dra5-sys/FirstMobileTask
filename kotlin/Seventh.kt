import kotlin.math.sqrt

fun sqr(n: Int): Int {
    val root = n * n
    return root
}

fun discriminant(a: Int, b: Int, c: Int): Int {
    val discriminantFormula = sqr(b) - 4*a*c
    return discriminantFormula
}

fun rootsNumber(a: Int, b: Int, c: Int): Int {
    val discriminantFormula = discriminant(a, b, c)
    return when  {
        discriminantFormula > 0 -> 2
        discriminantFormula == 0 -> 1
        else -> 0
    }
}

fun quadraticRoot(a: Int, b: Int, c: Int) {
    var firstRoot = 0.0
    var secondRoot = 0.0
    var thirdRoot = 0
    val rootNumber = rootsNumber(a, b, c)
    val discriminantNumber = discriminant(a, b, c).toDouble()

    if (rootNumber == 2) {
        firstRoot = ((-1*b) + sqrt(discriminantNumber)) / 2*a
        secondRoot = ((-1*b) - sqrt(discriminantNumber)) / 2*a
        println("First root $firstRoot, second root $secondRoot")
    } else if (rootNumber == 1) {
        thirdRoot = (-1*b) / 2 * a
        println("Third root: $thirdRoot")
    } else if (rootNumber == 0) {
        print("No one root")
    }
}

fun main() {
    sqr(2)
    println()

    print("Discriminant: ${discriminant(2, 4, 2)}")
    println()

    rootsNumber(2, 4, 2)
    print("The number of roots: ${rootsNumber(2, 4, 2)}")
    println()

    quadraticRoot(2, 4, 2)
}