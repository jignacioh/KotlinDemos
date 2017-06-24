
/**
 * Created by root on 23/06/17.
 */

fun main(args:Array<String>){

    var mCar=Car("rojo","toyota",1991,4)
    println(mCar.toString())

    var aAnimal= Animal()
    aAnimal.SetPatas(4)

    print("Tiene "+aAnimal.GetPatas()+" patas")
}

open class Vehicle(rueda :Int){
    var rueda :Int?=null
    init {
        this.rueda=rueda
    }

    override fun toString(): String {
        return "[rueda : $rueda ]"
    }
}

class Car(color :String, marca :String, anio :Int,ruedas :Int) : Vehicle(ruedas){

    var color :String?=null
    var marca : String?=null
    var anio : Int?=null

    init {
        super.rueda=ruedas
        this.color=color
        this.marca=marca
        this.anio=anio
    }

    override fun toString(): String {
        return "[color : $color, \n" +
                "marca : $marca, \n" +
                "anio : $anio, \n" +
                "rueda : $rueda ]"
    }

    fun GetColor():String?{
        return color
    }
    fun SetColor(color:String):Unit{
        this.color=color
    }
    fun GetMarca():String?{
        return marca
    }
    fun SetMarca(marca: String):Unit{
        this.marca=marca
    }
    fun GetAnio():Int?{
        return anio
    }
    fun SetAnio(anio : Int):Unit{
        this.anio=anio
    }
}

class Animal(){

    var patas : Int?=null


    constructor(patas : Int):this(){
        this.patas=patas
    }

    open fun GetPatas():Int?{
        return this.patas
    }
    open fun SetPatas(patas :Int):Unit{
        this.patas=patas
    }

}

class Vaca(){

    var cuernos :Int?=null

    constructor(cuernos :Int):this(){
        this.cuernos=cuernos

    }

    fun GetCuernos():Int?{
        return this.cuernos
    }
    fun SetCuernos(cuernos :Int):Unit{
        this.cuernos=cuernos
    }
}





