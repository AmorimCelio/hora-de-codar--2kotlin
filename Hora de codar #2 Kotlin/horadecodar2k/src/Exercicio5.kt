fun main() {
    val valores = DoubleArray(6)

    for (i in valores.indices) {
        print("Digite o valor ${i + 1}: ")
        valores[i] = readln().toDoubleOrNull() ?: 0.0
    }

    println("Os valores informados são: ${valores.joinToString(", ")}")

    val soma = valores.sum()
    val media = soma / valores.size

    println("A média aritmética dos valores é: $media")
}
