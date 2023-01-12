//Crea una clase llamada Libro que guarde información de cada uno de los libros de una biblioteca:
public class Libro {

    //La clase debe guardar el título, autor, número de ejemplares del libro y número de ejemplares prestados.
    private final String titulo;
    private final String autor;
    private final int ejemplares;
    private int prestados;

    //Constructor con parámetros título, autor y número de ejemplares.
    public Libro(String titulo, String autor, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = 0;
    }

    //Métodos setters/getters necesarios
    public String getTitulo() {
        return titulo;
    }

    //Método préstamo que incremente el atributo correspondiente cada vez que se realice un préstamo del libro.
    public boolean prestamo() {
        //No se podrán prestar libros de los que no queden ejemplares disponibles para prestar.
        if (prestados<ejemplares){
            this.prestados++;
            //Devuelve true si se ha podido realizar la operación.
            return true;
        }
        //y false en caso contrario.
        return false;
    }

    //Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro.
    public boolean devolucion() {
        //No se podrán devolver libros que no se hayan prestado.
        if (prestados>0){
            this.prestados--;
            //Devuelve true si se ha podido realizar la operación.
            return true;
        }
        //y false en caso contrario.
        return false;
    }

    //Método toString para mostrar los datos de los libros.
    @Override
    public String toString(){
        return "--Libro: " + titulo +
                "\nAutor: " + autor +
                "\nEjemplares: " + ejemplares +
                "\nPrestados: " + prestados + "\n";
    }
}
