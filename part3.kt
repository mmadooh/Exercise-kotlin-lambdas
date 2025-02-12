package `Exercise-kotlin-lambdas`

val divideTreasure: (Double, Double) -> Double = { a, b -> a / b }

fun main() {
    println(divideTreasure(1000.0, 5.0))
}