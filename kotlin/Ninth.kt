import kotlin.math.sqrt

class Vector(var x: Double, var y: Double, var z: Double) {
    fun theLengthOfTheVector(): Double {
        val vectorLength = sqrt((x*x) + (y*y) + (z*z))
        return vectorLength
    }

    infix fun theDotProductOfVectors(second: Vector) : Double {
        val scalarProduct = x * second.x + y * second.y + z * second.z
        return scalarProduct
    }

    operator fun times(scalar: Vector): Double {
        var dotProduct = x * scalar.x + y * scalar.y + z * scalar.z
        return dotProduct
    }
}

fun theDotProductOfVectorsSecond(first: Vector, second: Vector) : Double {
    var scalarProduct = first.x * second.x + first.y * second.y + first.z * second.z
    return scalarProduct
}

fun main() {
    val workWithFirstVector = Vector(1.0, 5.0, 1.0)
    val workWithSecondVector = Vector(2.0, 2.0, 10.0)
    val mul = workWithFirstVector * workWithSecondVector
    val otherMu = theDotProductOfVectorsSecond(workWithFirstVector, workWithSecondVector)

    print("The length of the vector: ${workWithFirstVector.theLengthOfTheVector()}")
    println()

    print("The dot product of vectors: ${workWithSecondVector theDotProductOfVectors workWithFirstVector}")
    println()

    print("The dot product of vectors: $mul")


    println()
    print("The OTHER dot product of vectors: $otherMu")
    println()
}