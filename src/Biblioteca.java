//Crea también la clase Biblioteca:
public class Biblioteca {
    //La clase estará compuesta por un array de 100 libros. Las bibliotecas tienen un nombre y un barrio o población donde están localizados.
    //También tendrá un atributo con el número de libros actuales de la Biblioteca. <-- Lo ignoré
    private final Libro[] libros;
    private final String nombre;
    private final String barrio;

    // Constructor por defecto donde tendrán 3 ejemplares de los siguientes libros básicos de cualquier biblioteca.
    public Biblioteca(String nombre, String barrio) {
        this.libros = new Libro[100];
        this.libros[0] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes Saavedra", 3);
        this.libros[1] = new Libro("Cien años de soledad", "Gabriel García Márquez", 3);
        this.libros[2] = new Libro("El alquimista", "Paulo Coehlo", 3);
        this.libros[3] = new Libro("20 poemas de amor y una canción desesperada", "Pablo Neruda", 3);
        this.libros[4] = new Libro("La ciudad y los perros", "Mario Vargas Llosa", 3);
        this.libros[5] = new Libro("La casa de los espíritus", "Isabel Allende", 3);
        this.libros[6] = new Libro("Desolación", "Gabriela Mistral", 3);
        this.libros[7] = new Libro("Rayuela", "Julio Cortázar", 3);
        this.libros[8] = new Libro("El Aleph", "Jorge Luis Borges", 3);
        this.libros[9] = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", 3);
        this.nombre = nombre;
        this.barrio = barrio;
    }

    //Métodos setters/getters necesarios.
    //Ninguno es necesario.


    //Método para recuperar un libro por parte de su título.
    //Ignorar advertencia de never used.
    public int recuperarLibro(String titulo) {
        for (int i = 0; i < this.libros.length; i++) {
            //Devolverá la posición del libro en el array si existe.
            if (titulo.equals(libros[i].getTitulo())) return i;
        }
        //y –1 si no existe.
        return -1;
    }

    //Método para añadir un nuevo libro a la Biblioteca, junto con el número de ejemplares que tendrá ese nuevo libro.
    public boolean agregarLibro(String titulo, String autor, int ejemplares) {
        //No se podrán añadir ejemplares si la biblioteca está llena de libros.
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                this.libros[i] = new Libro(titulo, autor, ejemplares);
                //Devuelve true si se ha podido realizar la operación.
                return true;
            }
        }
        //y false en caso contrario.
        return false;
    }

    //Método para eliminar un libro (todos los ejemplares) de una biblioteca a partir de parte de su título.
    public boolean eliminarLibro(String titulo) {
        for (int i = 0; i < this.libros.length; i++) {
            //Eliminará el primer libro que encuentre que cumpla las condiciones.
            if (libros[i] != null && titulo.equals(libros[i].getTitulo())) {
                libros[i] = null;
                //Devuelve true si se ha podido realizar la operación.
                return true;
            }
        }
        //y false en caso contrario.
        return false;
    }

    //Método préstamo para la biblioteca.
    public boolean prestarLibro(String titulo) {
        for (Libro libro : this.libros) {
            //que presta un libro si hay libros disponibles y existe.
            if (libro != null && titulo.equals(libro.getTitulo())) {
                //Devuelve true si se ha podido realizar la operación.
                return libro.prestamo();
            }
        }
        //y false en caso contrario.
        return false;
    }


    //Método devolución para la biblioteca.
    public boolean devolverLibro(String titulo) {
        for (Libro libro : this.libros) {
            //que devuelve un libro si existe.
            if (libro != null && titulo.equals(libro.getTitulo())) {
                //Devuelve true si se ha podido realizar la operación.
                return libro.devolucion();
            }
        }
        //y false en caso contrario.
        return false;
    }


    //Método toString para mostrar los datos de la biblioteca junto a todos sus libros.
    @Override
    public String toString() {
        //Mostrar solo los libros válidos, no las posiciones del array sin libros.
        StringBuilder sb = new StringBuilder();
        for (Libro libro : libros) {
            if (libro != null) {
                sb.append(libro);
            }
        }
        return "-------------------------\n" +
                "---Nombre de la Biblioteca: " + nombre +
                "\n---Dirección: " + barrio +
                "\n-----Lista de libros-----\n" + sb + "-------------------------\n";

    }

}
