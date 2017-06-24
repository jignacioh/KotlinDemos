
import javafx.beans.binding.When
import java.math.BigDecimal
import java.math.BigInteger
import java.util.*

/**
 * Created by root on 14/06/17.
 */
fun main(args:Array<String>){

    var name: String?
    name=null
    println(name)

    // !! var cant be null
    // ? cant be null


    //convert type data

    var n1:Int=102
    var n2:Int?
    var stringN3:String = "20"
    var stringN4:String = "440000034.45"
    var n4:Float?
    var n5:Double?
    n2 = stringN3.toInt()
    n4 = stringN3.toFloat()
    n5 = n2.toDouble()
    var n6:Float= stringN4.toFloat()
    var n7:Double= stringN4.toDouble()
    var n8:Float = 3.14159839.toFloat()
    var n9:Short = 3.14159839.toFloat().toShort()

    var n10: BigInteger = BigInteger("90000456")
    var n11: BigDecimal = BigDecimal("233000495.123")

    var n12:Int = 3.14159839.toInt()


    println("Numero 3 "+n2)
    println("Numero float "+n4)
    println("Numero double "+n5)

    println("Numero float decimal "+n6)
    println("Numero double decimal "+n7)

    println("Numero float decimal "+n8)
    println("Numero short decimal "+n9)

    println("Numero big decimal "+n11)
    println("Numero big integer "+n10)

    println("Numero  integer "+n12)


    println("=============MATH CALCULATOR==============")

    var continues : Int=0
    println("Suma +")
    println("Resta -")
    println("Multiplicacion *")
    println("Division /")
    do {

        var result :Int

        print("Numero 1 ")
        var firstNumber = readLine()!!.toInt()
        print("Numero 2 ")
        var secondNumber = readLine()!!.toInt()

        print("Operacion ")
        var operation = readLine()!!

        when(operation){

            "+" -> result =firstNumber+secondNumber
            "-" -> result =firstNumber-secondNumber
            "*" -> result =firstNumber*secondNumber
            "/" -> result =firstNumber/secondNumber
            else -> result = 0
        }
        //println("El resultado es "+result)
        //print("Desea otra operacion --> 1-Si, 2-No ")
        //continues= readLine()!!.toInt()
    }while (continues.equals(1))



    println("==============FIN PROGRAMA================")


    println("==============PRIORIDADES================")
    // ()
    //++, -- before var
    // pow
    //* /
    //+ -
    //=
    //++. -- after var
    //

    var x=3
    var y=4
    var z=5

    var w=9
    var v=7

    var a :Int
    var b :Int

    a=x++-y*z+--v-w++

    println("var a+"+a)

    b=a++

    println("var a+"+a)
    println("var b+"+b)
    println("var x+"+x)
    println("var y+"+y)
    println("var z+"+z)
    println("var w+"+w)
    println("var v+"+v)

    println("==============FIN PRIORIDADES================")


    println("==============COMPARACIONES AND IF================")


    var valueCompare : Int = 2930
    println( valueCompare>3000 || valueCompare.rem(10)<=300)

    var currentYear=Calendar.getInstance().get(Calendar.YEAR)
    var birthdayYear= readLine()!!.toInt()

    var myAge= currentYear-birthdayYear

    println("mi edad actual es $myAge años")


    println("==============FIN COMPARA================")

    println("============== WHEN ================")

    when(myAge){

       in 30..40 ->{
            println("Tiene familia")
       }
       18,19,20 ->{
            println("esta en universidad")
       }
       in 21..29 ->{
           println("seguro esta en everis")
       }
       else ->{
           println(" ni idea")
       }
    }


    println("======================================")

    println("============== WHEN if ================")

    var nA=20
    var nB=21

    var result = if (nA>nB) nA else nB

    println("result is $result")


    var isExact = when (result){

        result.rem(8) -> false
        result.rem(3) -> true
        else -> false
    }

    println("$result is exact $isExact")

    println("======================================")

    println("============= LOOP    ================")

    /*for (item in 2..10){

        print("hola $item")
        for (item in 3..5){
            print("adios $item")
        }

    }*/
    var bigValue=190
    while (bigValue.rem(23)>1){

        bigValue-=13
        println("Big value $bigValue")
    }

    loop@ for (count in 2..10){
        println("count is $count")
        for (count2 in 3..6) {
            println("count2 is $count2")
            if (count2 == 5) {
                break@loop //rompe loop que etiquetas
            } else {
                continue
            }
        }
    }

    println("======================================")

}