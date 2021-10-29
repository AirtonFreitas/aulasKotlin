fun main (){
    println("Hello Word")

    /*
    println("Double: Máximo " + Double.MAX_VALUE + " Mínimo " + Double.MIN_VALUE)
    println("Float: Máximo " + Float.MAX_VALUE + " Mínimo " + Float.MIN_VALUE)
    println("Long: Máximo " + Long.MAX_VALUE + " Mínimo " + Long.MIN_VALUE)
    println("Int: Máximo " + Int.MAX_VALUE + " Mínimo " + Int.MIN_VALUE)
    println("Short: Máximo " + Short.MAX_VALUE + " Mínimo " + Short.MIN_VALUE)
    println("Byte: Máximo " + Byte.MAX_VALUE + " Mínimo " + Byte.MIN_VALUE)
    */

    //Váriaveis Mutáveis
    var nome = "Airton Siqueira de Freitas"
    var texto = """batatinha quando nasce
        |espalha rama pelo chao.
        |Nossa! vou ter que catar tudo.
    """.trimMargin()

    //Variaveis Imutáveis
    val z : Int = 28
    val t = 28


    println("O nome completo é: $nome e a idade é $z")


    println("O nome completo é: " + nome + " e a idade é " + z)


    println(texto)

    val a = 10
    val b = 20
    val c = 30

    println("O bonus é: ${a+b+c}")

    var x = 6
    var y = 3
    println("x = $x")

}

fun calcularDigito(a: Int, b: Int, c: Int) {
    println("O bonus é: ${a+b+c}")
}

