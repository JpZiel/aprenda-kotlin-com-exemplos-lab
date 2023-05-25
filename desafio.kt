enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario (val name: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuario: Usuario) {
        inscritos.addAll(usuario)

    }
}

fun main() {

    val kotlin = listOf(
        ConteudoEducacional("Sintaxe Kotlin", 15),
        ConteudoEducacional("POO com Kotlin", 20),
        ConteudoEducacional("Debbuging Kotlin", 10),
        ConteudoEducacional("Projeto prático kotlin", 5)
    )

    val java = listOf(
        ConteudoEducacional("Sintaxe Java", 15),
        ConteudoEducacional("POO com Java", 20),
        ConteudoEducacional("Debbuging Java", 10),
        ConteudoEducacional("Projeto prático Java", 5)
    )
        val javascript = listOf(
        ConteudoEducacional("Sintaxe Javascript", 15),
        ConteudoEducacional("Desafio de código Javascript", 20),
        ConteudoEducacional("Debbuging Javascript", 10),
        ConteudoEducacional("Projeto prático Javascript", 5)
    )


    val usuario1 = Usuario ("João Pedro")
    val usuario2 = Usuario ("Gustavo")
    val usuario3 =  Usuario ("Maria") 

    val formacaoJava = Formacao("Java", java, Nivel.AVANCADO)
    val formacaoKotlin = Formacao("Kotlin", kotlin, Nivel.INTERMEDIARIO)
    val formacaoJavascript = Formacao("JavaScript", javascript, Nivel.BASICO)

    formacaoJava.matricular(usuario1, usuario2)
    formacaoKotlin.matricular(usuario1)
    formacaoJavascript.matricular(usuario3)

    println("Alunos da trilha Java: ${formacaoJava.inscritos.joinToString { it.name }}")
    println("Alunos da trilha Kotlin: ${formacaoKotlin.inscritos.joinToString { it.name }}")
    println("Alunos da trilha JavaScript: ${formacaoJavascript.inscritos.joinToString { it.name }}")
}
