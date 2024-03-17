//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
Todos os Exercícios foram comentados
para que todas as funcôes
possam estar em uma só classe!

*/

//Ex. 1  -------------------------------

/*fun main (){
    val indice: Int = 13
    var soma: Int = 0
    var k : Int = 0


    while (k < indice){
        k += 1
        soma += k
    }
    print("Ao final do processamento o número final da SOMA é: $soma")
}*/



//Ex. 2  -------------------------------

/*fun main(){
    println("Digite um número para verificar se ele pertence à sequencia de Fibonacci:\n")
    val numero = readLine()?.toIntOrNull()

    if (numero!= null){
        val resultado = verificarFibonacci(numero)
        if (resultado){
            println("$numero pertence à sequência")
        }else{
            println("$numero não pertence à sequência")

        }
    }
}
fun verificarFibonacci(numero:Int):Boolean{
    var anterior = 0
    var atual = 1

    while (atual<numero){
        val proximo = anterior+atual
        anterior = atual
        atual = proximo

        if(atual==numero){
            return true
        }
    }
    return false
}*/



//Ex. 3  -------------------------------

/*
A) Sempre é somado mais 2.
Resposta: 9

B) Sempre é Multiplicado por 2.
Resposta: 128

C) Sequência relacionada aos quadrados de cada número em ordem: 0,1,2,3..
Resposta: 49

D) Sequência relacionada aos quadrados de números pares.
Resposta: 100

E) Sequência de Fibonacci.
Resposta é: 13

F) Sequência de números que começam com D.
Resposta: 200
*/



//Ex. 4  -------------------------------

/*
Eu manteria a luz do interrupitor 1 ligada por um bom tempo a desligaria
 e acenderia o interrupitor 2.

ao ir na primeira e segunda sala devo averiguar se a lampada esta ligada, quente ou fria.
ex. se na primeira sala a luz estiver ligada e na segunda estiver deligada e quente saberei que:

    Interruptor 2 coresponde a sala 1
    Interruptor 1 coresponde a sala 2
    Interruptor 3 coresponde a sala 3
*/



//Ex. 5  -------------------------------

/*fun main(){
    println("Digite uma Frase:")
    val texto = readLine().toString()

    for (i in texto.length - 1 downTo 0){
        print(texto[i])
    }
}*/
