fun calculaBonus(cargo:String, salario: Float): Float{
    //println("O Bonus é: ${a+b*c*2}")
    //Gerente JR, Gerente Senior, Coordenador

    return if (cargo == "Coordenador") {
        salario * 1.2f
    } else if (cargo == "Gerente JR") {
        salario * 1.5f
    } else {
        salario * 2
    }
}


//if - else
fun maiorDeIdade(idade:Int) : Boolean {
    return idade >=18
    /*if(idade >= 18){
        println("Maior de idade!")
    }else{
        println("Menor de Idade!")
    }*/
}
fun main(){
    //maiorDeIdade(10)
    //maiorDeIdade(18)
    //maiorDeIdade(28)
    println(calculaBonus("Coordenador", 1500f))
    println(calculaBonus("Gerente JR", 1500f))
    println(calculaBonus("Gerente Senior", 1500f))
}