fun main() {
    var soma = 0
    var contador = 0

    for (i in 1..4) {
        print("Digite um número entre 1 e 9: ")
        val numero = readln().toInt()
        if (numero in 1..9) {
            soma += numero
            contador++
        } else {
            println("Número fora do intervalo permitido. Tente novamente.")
            return
        }
    }

    val media = soma.toDouble() / contador

    println("Média: $media")
    if (media > 5) {
        println("Você passou no teste")
    } else {
        println("Tente novamente")
    }
}