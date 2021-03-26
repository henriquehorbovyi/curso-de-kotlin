fun main() {
    val a = 2
    val b = 6
    val soma = somar(x = a, y = b)
    val sub = subtracao(8, 6)
    val div = divisao(x = 10, y = 5)

    val mes = nomeDoMes(7)

    val m = escolherMaior(5,7)

    dizerOlaPara("Rangel")

}

fun dizerOlaPara(fulano: String) {
    println("Olá $fulano")
}

fun escolherMaior(a: Int, b: Int): Int {
    return if (a > b) a else b
}


fun nomeDoMes(numeroDoMes: Int): String {

    val nomeDoMes = when (numeroDoMes) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Mês inválido"
    }
    return nomeDoMes
}




fun somar(x: Int, y: Int): Int {
    return x + y
}

fun subtracao(x: Int, y: Int): Int = x - y

fun multiplicacao(a: Int, b: Int): Int {
    return a * b
}

fun divisao(x: Int, y: Int): Int {
    return x / y
}