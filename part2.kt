package `Exercise-kotlin-lambdas`

val findPearl: (Int) -> Int = { a -> a * a }

fun main() {
    println(findPearl(6))
}