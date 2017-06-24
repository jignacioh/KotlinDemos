import java.util.*
import kotlin.collections.HashMap

/**
 * Created by root on 21/06/17.
 */
fun main(args:Array<String>){

    var name ="Juan Hurtado Cerron"

    for (count in 0..name.length-1){
        println("inicial"+ name[count].toUpperCase())

    }

    var aName=name.split(" ")

    for (count2 in 0..aName.count()-1){
        println("Parte $count2 es "+aName[count2])
    }

    name.trim()

    println(name)

    var arrayInt = Array<Int>(4){3} // 4 espacios reservador con valor 3 cada uno

    for (count in 0..arrayInt.size-1){
        println("array[$count] "+arrayInt[count])
    }
    for (count in 0..arrayInt.size-1){
        arrayInt[count]=count
    }
    for (element in arrayInt){
        println("array["+arrayInt.indexOf(element)+"] = "+element)
    }

    println(aName.contains("Hurtado"))
    println(aName.contains("hurtado"))


    var mHash: java.util.HashMap<String, String> = java.util.HashMap<String,String>()
    mHash.put("edad","12")
    mHash.put("ojos","azules")

    println(mHash.get("edad"))

    for (k in mHash.keys){

        println("key $k value is "+mHash.get(k))

    }

    var hashMap: HashMap<Int, String> = HashMap<Int,String>()

    hashMap.put(1,"joey")
    hashMap.put(2,"seto")
    hashMap.put(3,"tea")

    println(hashMap.get(3))

    hashMap.put(4,"yugi")

    for (k in hashMap.keys){
        println("value "+hashMap.get(k))
    }

    var aOfMaker= arrayOf(3,2,4,"1")

    var hashOfMaker= hashMapOf(1 to "color", 2 to "azul", 3 to "verde")


    // SET Y MUTABLE SET NO TIENEN DATOS REPETIDOS

    var setElement = setOf(1,23,4,5,21,9,5,6)
    // add not work set
    for(element in setElement){
        println(element)
    }

    var setMutElement = mutableSetOf(1,5,9,11,30,56,9,12)
    // add not work set

    setMutElement.add(15)
    for(element in setMutElement){
        println(element)
    }

}