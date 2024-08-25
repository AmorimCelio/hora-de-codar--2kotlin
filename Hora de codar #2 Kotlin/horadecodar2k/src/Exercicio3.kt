fun main() {
    print("Digite o primeiro valor: ")
    val valor1 = readln().toDoubleOrNull() ?: 0.0

    print("Digite o segundo valor: ")
    val valor2 = readln().toDoubleOrNull() ?: 0.0

    print("Digite o terceiro valor: ")
    val valor3 = readln().toDoubleOrNull() ?: 0.0

    val maior = when {
        valor1 > valor2 && valor1 > valor3 -> valor1
        valor2 > valor1 && valor2 > valor3 -> valor2
        else -> valor3
    }

    println("O maior valor é: $maior")
}
