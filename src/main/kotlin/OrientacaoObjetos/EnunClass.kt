package OrientacaoObjetos
/* 1 Enun Class serve para trabalhar com valores constantes,por exemplo, norte,sul,leste,oeste; nivel de
    dificuldade de um jogo, facil, medio, dificil; etc.*/

/*enum class State {
    IDLE, RUNNING, FINISHED // parado, executando, finalizado
}

fun main() {
    val state = State.RUNNING
    // 2 começando no estado correndo
    val message = when (state) {
        // 3
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)
}*/

// exemplo 2, Enun Class com parametro de construção e com função pré definida
enum class Color(val rgb: Int) {                      // 1
    RED(0xFF0000),                                    // 2
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)  // 3
}

fun main() {
    val red = Color.RED
    println(red)                                      // 4
    println(red.containsRed())                        // 5
    println(Color.BLUE.containsRed())                 // 6
    println(Color.YELLOW.containsRed())               // 7
}