
fun main (args: Array<String>)
{
    println("hola mundo :D\n"+1)

    var a =1.3f
    var b =8
    var c= b.toDouble()

    var dou :Double = 1.222222222
    var floa: Float =1.55f
    var autores :MutableList<String> = arrayListOf("hola","pepe","jose")
    var paginas:MutableList<String> = arrayListOf("","un pollito vivia feliz", "un dia se murio","petalos negros","tormenta de verano")
    var libro = Libro ("el pollito que murio", 1,5,autores,paginas)
    libro.mostrarPagina(5)

    var t :String ="hola"
    println("double: "+(dou))
    println("float: "+(floa))
    println("a+b: "+(a+b))
    showInfo("firulais","perro",10)
    println("años:"+multiplicar(2,5))
    mostrarDias()


}

fun suma(numero1:Int , numero2:Int) :Int
{
    return numero1+numero2
}

fun sumaf(numero1: Int,numero2: Int):Float
{
    return (numero1+numero2).toFloat()
}

fun showInfo(name : String , especie:String, edad : Int): Unit
{
    println(" el nombre del animal es $name, correspondiente a la especie $especie y tiene una edad de $edad")
}

fun multiplicar(factor1:Int,factor2:Int): Int = factor1*factor2

fun printMonth(mes:Int):Unit
{
    when(mes)
    {
        1-> println("Enero")
        2-> println("febrero")
        3,4,5,6,7,8,9,10,11,12 -> println("los otros meses")
        else -> println("cabron esto ni siquiera es el numero de un mes ")

    }
}

fun printAlgo(algo:Any)
{
    when(algo)
    {
        is Int-> println("esto es un entero ")
        is Float -> println("numero con punto flotante con 6 digitos ")
        is String-> println("un pinche String")
        else -> println("no se que pinche madre es esto ")
    }

}


fun mostrarDias():Unit
{
    var dias : MutableList<String> = mutableListOf("lunes","martes","miercoles","jueves","viernes","sabado","domingo")

    for ( (numero,dia) in dias.withIndex())
    {
        println("el dia es $dia , correspondiente al "+(numero+1)+"º dia de la semana")
    }
}