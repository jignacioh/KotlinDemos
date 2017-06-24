/**
 * Created by root on 21/06/17.
 */


fun main(args:Array<String>){


    print("Ingrese base ")
    var base = readLine()!!.toDouble()
    print("Ingrese potencia ")
    var potencia = readLine()!!.toInt()

    println("$base a la potencia $potencia es "+recursivaPotencia(base,potencia))

    print("Ingrese radio ")
    var radio= readLine()!!.toDouble()

    println("Area de circulo con radio $radio es "+areaCirculo(radio))

    esMayor(5,6)
    esMayor(9.0,4.5,2.3)
}

fun recursivaPotencia(base : Double, potencia :Int) : Double{

    when (potencia){

        0 -> return 1.toDouble()
        1 -> return base
        else -> return base * recursivaPotencia(base , potencia-1)
    }

}

fun areaCirculo(radio : Double) : Double{
    return Math.PI*recursivaPotencia(radio,2)
}

fun esMayor(num1 : Int,num2 :Int): Unit {

    if (num1 > num2) {
        println("es mayor")
    } else {
        println("es menor")
    }

}


fun esMayor(num1 : Double,num2 :Double, num3:Double): Unit{

    if (num1>num2 && num2>num3){
        println("es mayor")
    }else{
        println("es menor")
    }

}
