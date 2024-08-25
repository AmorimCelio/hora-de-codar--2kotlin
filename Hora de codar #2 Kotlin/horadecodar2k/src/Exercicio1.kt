fun main() {
    print("Digite o primeiro número: ")
    val numero1 = readln().toIntOrNull() ?: 0

    print("Digite o segundo número: ")
    val numero2 = readln().toIntOrNull() ?: 0

    val maior = if (numero1 > numero2) numero1 else numero2

    println("O maior número é: $maior")
}
