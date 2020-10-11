

class Libro constructor( titulo:String
                         ,edicion: Int
                         ,numeroDePaginas : Int
                         ,autores: MutableList<String>
                         ,paginas: MutableList<String>)
{
    var titulo:String =" "
    var edicion: Int =0
    var numeroDePaginas : Int =0
    var autores: MutableList<String> = mutableListOf(" ")
    var paginas: MutableList<String> = mutableListOf(" ")
    var paginaActual: Int=0

    init
    {
        println("se creo el libro: $titulo")
    }

    fun pasarPagina(): Unit
    {
        if(this.numeroDePaginas>this.paginaActual)
        {
            this.paginaActual += 1
        }
        else
        {
            println("libro terminado")
        }
    }

    fun reiniciarLibro(): Unit
    {
        this.paginaActual=1
    }

    fun mostrarPagina( pagina: Int): Unit
    {

        if((pagina-1)<=this.numeroDePaginas && (pagina-1)>=0)
        {
            println("la pagina $pagina corresponde a:")
            println(paginas[pagina-1])
        }
        else
        {
            println("pagina incorrecta")
        }
    }


}

