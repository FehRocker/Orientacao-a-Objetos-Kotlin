package OrientacaoObjeto

open class Tiger(val origin: String) {
    // classe aberta Tigre com parametro definido origin, que recebe uma Str
    fun sayHello() { // função que nao pode ser sobrescrita.
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")
/*1 classe SiberianTiger herda da classe Tiger e é passado "Siberia" como valor para origin, ou seja,
a classe Tigre da Sibéria é um tigre, e sua origem é Siberia.
 */

fun main() {
    val tiger: Tiger = SiberianTiger() //polimorfismo
    tiger.sayHello()
}