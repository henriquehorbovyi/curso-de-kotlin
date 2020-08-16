fun main() {
    // #1 Exemplo da idade
    val idade = 17

    if (idade >= 18) {
        println("Pode entrar")
    } else {
        println("Va pra casa")
    }   


    // #2 Exemplo da hora
    val hora = 18

    if (hora < 12) {
        println("Bom dia")
    } else if (hora >= 12 && hora < 18) {
        println("Boa tarde")
    } else {
        println("Boa noite")
    }

    // #3 Exemplo do maio número 
    val a = 42
    val b = 6
    var maior = 0

    maior = if (a > b) a else b

    println(maior)
}