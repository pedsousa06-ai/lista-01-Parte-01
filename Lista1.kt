// Lista 1 - Parte 1 (Kotlin)
// Cada exercício é uma função; o main() chama todas.

// 1) Par ou ímpar
fun ex01() {
    val numero = 7
    if (numero % 2 == 0) {
        println("$numero é par")
    } else {
        println("$numero é ímpar")
    }
}

// 2) Positivo, negativo ou zero
fun ex02() {
    val numero = -5
    if (numero > 0) {
        println("$numero é positivo")
    } else if (numero < 0) {
        println("$numero é negativo")
    } else {
        println("O número é zero")
    }
}

// 3) Faixa etária
fun ex03() {
    val idade = 25
    val categoria = when {
        idade < 12 -> "Criança"
        idade in 12..17 -> "Adolescente"
        idade in 18..59 -> "Adulto"
        else -> "Idoso"
    }
    println("Idade $idade: $categoria")
}

// 4) Tabuada de 1 a 10
fun ex04() {
    val numero = 7
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}

// 5) Soma de todos os números do array
fun ex05() {
    val numeros = arrayOf(1, 2, 3, 4)
    var soma = 0
    for (n in numeros) {
        soma += n
    }
    println("Soma: $soma") // 10
}

// 6) Maior número do array
fun ex06() {
    val numeros = arrayOf(5, 8, 2, 10, 3)
    var maior = numeros[0]
    for (n in numeros) {
        if (n > maior) maior = n
    }
    println("Maior: $maior") // 10
}

// 7) Contagem regressiva até zero
fun ex07() {
    var contador = 10
    while (contador >= 0) {
        println(contador)
        contador--
    }
}

// 8) Soma apenas dos números pares
fun ex08() {
    val numeros = arrayOf(1, 2, 3, 4)
    var soma = 0
    for (n in numeros) {
        if (n % 2 == 0) soma += n
    }
    println("Soma dos pares: $soma") // 6
}

// 9) Função que retorna o dobro
fun dobro(numero: Int): Int {
    return numero * 2
}

fun ex09() {
    println(dobro(8)) // 16
}

// 10) Função que retorna a média de 3 notas
fun media(nota1: Double, nota2: Double, nota3: Double): Double {
    return (nota1 + nota2 + nota3) / 3
}

fun ex10() {
    println("%.2f".format(media(7.0, 8.0, 9.0))) // 8.00
}

// 11) Celsius para Fahrenheit
fun celsiusParaFahrenheit(c: Double): Double {
    return c * 1.8 + 32
}

fun ex11() {
    println(celsiusParaFahrenheit(36.5)) // 97.7
}

fun main() {
    val exercicios = listOf(
        ::ex01, ::ex02, ::ex03, ::ex04, ::ex05, ::ex06,
        ::ex07, ::ex08, ::ex09, ::ex10, ::ex11
    )
    exercicios.forEachIndexed { i, ex ->
        println("== Exercício ${i + 1}")
        ex()
    }
}
