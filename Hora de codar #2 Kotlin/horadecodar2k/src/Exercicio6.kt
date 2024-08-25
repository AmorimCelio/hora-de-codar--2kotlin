fun main() {
    val numeros = IntArray(4)

    for (i in numeros.indices) {
        print("Digite o ${i + 1}º número: ")
        numeros[i] = readln().toInt()
    }

    val maior = numeros.maxOrNull() ?: numeros[0]

    println("Primeiro valor: ${numeros[0]}")
    println("Último valor: ${numeros[numeros.size - 1]}")
    println("Maior valor: $maior")
}
