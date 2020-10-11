import java.io.File
import java.io.InputStream

fun main (args: Array<String>)
{


    showInfo("firulais","perro",10)
    println("resultado multiplicar:"+multiplicar(2,5))
    mostrarDias()
    println(" ")
    experimentosDatos()

    //objetos

    var autores :MutableList<String> = arrayListOf("hola","pepe","jose")
    var paginas:MutableList<String> = arrayListOf("","un pollito vivia feliz", "un dia se murio","petalos negros","tormenta de verano")
    var libro = Libro ("el pollito que murio", 1,5,autores,paginas)
    libro.mostrarPagina(5)



    var lector = Lector()
    var lines:List<String> =lector.archivoToArrayString("D:\\repo-git-local-2\\Kotlin-y-android\\kotlin_prueba1\\src\\pruebas.txt")
    lines.forEach{ println(" "+it)}

    println(lines.size)

}


fun suma(numero1:Int , numero2:Int) :Int
{
    return numero1+numero2
}

fun showInfo(name : String , especie:String, edad : Int): Unit
{
    println(" el nombre del animal es $name, correspondiente a la especie $especie y tiene una edad de $edad años")
}

fun multiplicar(factor1:Int,factor2:Int): Int = factor1*factor2


//when
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

//when in
fun printOtherMonth(mes:Int)
{
    when(mes)
    {
        in 1..6 -> println("primer semestre")
        in 6..12 -> println("segundo semestre")
        else -> println("noe  sun mes valido")
    }
}

//when is
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

//for
fun mostrarDias():Unit
{
    var dias : MutableList<String> = mutableListOf("lunes","martes","miercoles")

    for ( (numero,dia) in dias.withIndex())
    {
        println("el dia es $dia , correspondiente al "+(numero+1)+"º dia de la semana")
    }
}