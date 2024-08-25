fun main() {
    print("Digite um valor: ")
    val valor = readln().toDoubleOrNull() ?: 0.0

    when {
        valor > 0 -> println("O valor informado é positivo.")
        valor < 0 -> println("O valor informado é negativo.")
        else -> println("O valor informado é zero.")
    }
}
