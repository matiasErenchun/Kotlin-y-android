

fun experimentosDatos () : Unit
{
    val numero1 : Int =1
    var numero2 : Int =1

    var a : Float=1.3f
    var b =8
    var c:Double = b.toDouble()

    var dou :Double = 1.222222222
    var floa: Float = 1.55f

    println("double:$dou")
    println("float:$floa")
    println("a+b: ${a + b}\n")

    //numero1 +=1
    numero2 +=1
    numero2++

    //var numero2Null: Int =null
    var numeroNull: Int?=null

    var long :Long = numeroNull?.toLong() ?: 0
    println( "valor de long: $long")

    val numero3 = Integer(10)
    var numero4 = Integer(10)


    var resultado1 = if(numero3==numero4) true else false
    var resultado2 = if(numero3===numero4)true else false

    println("resultado1 de ==:$resultado1,$numero3 es igual $numero4")
    println("resultado2 de ===:$resultado2,$numero3 noe s el mismo objeto que $numero4")
}

fun sumaf(numero1: Int,numero2: Int):Float
{
    return (numero1+numero2).toFloat()
}