fun main() {
    print("Digite o primeiro valor: ")
    val valor1 = readln().toInt()

    print("Digite o segundo valor: ")
    val valor2 = readln().toInt()

    print("Escolha a operação (1: Adição, 2: Subtração, 3: Divisão, 4: Multiplicação): ")
    val operacao = readln().toInt()

    val resultado = when (operacao) {
        1 -> valor1 + valor2
        2 -> valor1 - valor2
        3 -> if (valor2 != 0) valor1 / valor2 else {
            println("Divisão por zero não é permitida.")
            return
        }
        4 -> valor1 * valor2
        else -> {
            println("Operação inválida.")
            return
        }
    }

    println("O resultado da operação é: $resultado")
}
