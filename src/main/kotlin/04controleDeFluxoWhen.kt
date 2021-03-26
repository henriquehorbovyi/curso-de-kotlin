fun main() {
    val numero = 8

    when {
        numero > 0 -> print("Número é positivo")
        numero < 0 -> print("Número é negativo")
        else -> print("ZERO")
    }

    val mes = 8
    val nomeDoMes = when (mes) {
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
    println(nomeDoMes)



    val nome = "Luis"
    if (nome == "Madson" || nome == "Eduardo" || nome == "Luis") {
        println("Nome válido")
    } else {
        println("Nome inválido")
    }


    when (val nome = "Eduardo") {
        "Madson", "Eduardo", "Luis" -> print(nome)
        else -> print("Nome inválido")
    }
}