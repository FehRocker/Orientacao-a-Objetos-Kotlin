package OrientacaoObjetos

open class Dog {
    // 1 Open class, da a permissao de seus atributos serem usados por outras classes
    open fun sayHello() {
        // 2 Open fun, o mesmo do exemplo a cima
        println("wow wow!")
    }
}

class Yorkshire : Dog() { // 3 youkshire herda a função da classe Dog
    override fun sayHello() {
        // 4 para sobrescrever a função sayHello, deve colocar "override" antes da função
        println("wif wif!")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}