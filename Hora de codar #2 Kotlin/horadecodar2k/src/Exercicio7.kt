fun main() {
    val numeros = IntArray(6)
    var soma = 0

    for (i in numeros.indices) {
        print("Digite o ${i + 1}º número: ")
        numeros[i] = readln().toInt()

        if (numeros[i] < 72) {
            soma += numeros[i]
        }
    }

    println("Soma dos valores inferiores a 72: $soma")

    println("Valores informados: ${numeros.joinToString(", ")}")
}
