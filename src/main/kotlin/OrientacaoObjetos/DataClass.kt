package OrientacaoObjetos

data class User(val name: String, val id: Int) {
    // 1 data class gera automaticamente funções como equals, hashcode, get e set, toString
    override fun equals(other: Any?) =
        other is User && other.id == this.id
// 2 comparar apenas o id para verificar a igualdade.
}
fun main() {
    val user = User("Alex", 1)
    println(user)
    // 3

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")   // 4
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    println(user.hashCode())                               // 5
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy())                                   // 6
    println(user === user.copy())                          // 7
    println(user.copy("Max"))                              // 8
    println(user.copy(id = 3))                             // 9

    println("name = ${user.component1()}")                 // 10
    println("id = ${user.component2()}")
}