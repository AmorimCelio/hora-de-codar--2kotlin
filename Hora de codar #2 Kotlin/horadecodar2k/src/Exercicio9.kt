fun main() {
    print("Digite o ano de nascimento: ")
    val anoNascimento = readln().toInt()
    val anoAtual = 2024
    val idade = anoAtual - anoNascimento

    if (idade >= 16) {
        println("Você poderá votar este ano.")
    } else {
        println("Você não poderá votar este ano.")
    }
}
