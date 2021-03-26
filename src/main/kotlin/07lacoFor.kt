fun main() {
    val nomes = listOf(
        "Flávia", "Gustavo", "Carina",
        "Rammon", "Fabiano",
        "Marcos", "Douglas"
    )

    for (nome in nomes) {
        println(nome)
    }

    for (index in nomes.indices) {
        println(nomes[index])
    }

    for ((index, nome) in nomes.withIndex()) {
        println("Nome: $nome   |   Index: $index")
    }

    nomes.forEach { nome ->
        println(nome)
    }

    nomes.forEachIndexed { index, nome ->
        println("Nome: $nome   |   Index: $index ")
    }

    /* RANGES (0..100) */

    for (index in 0..nomes.lastIndex) {
        println(nomes[index])
    }
}
