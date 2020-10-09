
import java.io.File
import java.io.InputStream

class Lector
{
    fun archivoToArrayString(file : String):List<String>
    {
        val inputStream : InputStream =File(file).inputStream()
        val lineList = mutableListOf<String>()

        inputStream.bufferedReader().forEachLine { lineList.add(it) }
        lineList.forEach{ println(" "+it)}
        return lineList
    }
    
}