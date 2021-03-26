fun main() {
    val numeros: MutableList<Int> = mutableListOf()
    numeros.add(8)
    println(numeros)

    numeros.add(16)
    println(numeros)

    numeros.remove(16)
    println(numeros)

    val nomes = listOf(
        "Flávia", "Gustavo", "Carina",
        "Rammon", "Fabiano",
        "Marcos", "Douglas"
    )

    println(nomes.count()) // retorna a quantidade de elementos na lista (o mesmo que: nomes.size)
    println(nomes.isEmpty()) // retorna um boolean, true se a lista está vazia e false se a lista contém algum elemento
    println(nomes.first()) // retorna o primeiro elemento da lista (o mesmo que nomes.get(0) ou nomes[0])
    println(nomes.last()) // retorna o ultimo elemento da lista
    println(nomes.contains("Marcos")) // retorna true se a lista contém o elemento passado como parametro e false caso contrário
    println(nomes.asReversed()) // retorna a lista em ordem reversa
    println(nomes.sorted()) // retorna a lista em ordem alfabetica para elementos tipo string e em ordem crescente para números

    /* DICA: Dê uma olhada nas outras funções da lista ;) */

}