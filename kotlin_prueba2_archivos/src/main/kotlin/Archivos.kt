
import java.io.*

fun main (args: Array<String>)
{

    var nameFile : String = "hola.txt"
    val file : File = File(nameFile )
    val path :String = file.absolutePath
    path.replace("'\'","\\")
    println("string $path")


}






