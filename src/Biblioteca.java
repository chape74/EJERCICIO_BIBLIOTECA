import java.util.Arrays;

public class Biblioteca {
    private Libro[] libros;
    private String nombre;
    private String barrio;

    public Biblioteca(String nombre, String barrio) {
        this.libros = new Libro[100];
        this.libros[0] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes Saavedra",3);
        this.libros[1] = new Libro("Cien años de soledad", "Gabriel García Márquez",3);
        this.libros[2] = new Libro("El alquimista", "Paulo Coehlo",3);
        this.libros[3] = new Libro("20 poemas de amor y una canción desesperada", "Pablo Neruda",3);
        this.libros[4] = new Libro("La ciudad y los perros", "Mario Vargas Llosa",3);
        this.libros[5] = new Libro("La casa de los espíritus","Isabel Allende",3);
        this.libros[6] = new Libro("Desolación", "Gabriela Mistral",3);
        this.libros[7] = new Libro("Rayuela", "Julio Cortázar",3);
        this.libros[8] = new Libro("El Aleph", "Jorge Luis Borges",3);
        this.libros[9] = new Libro("El amor en los tiempos del cólera","Gabriel García Márquez",3);
        this.nombre = nombre;
        this.barrio = barrio;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public int recuperarLibro(String titulo){
        for (int i = 0; i < this.libros.length; i++) {
            if (titulo.equals(libros[i].getTitulo())) return i;
        }
        return -1;
    }

    public boolean agregarLibro(String titulo, String autor, int ejemplares) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i]==null) {
                this.libros[i] = new Libro(titulo, autor, ejemplares);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarLibro(String titulo) {
        for (int i = 0; i < this.libros.length; i++) {
            if (titulo.equals(libros[i].getTitulo())) {
                libros[i]=null;
                return true;
            }
        }
        return false;
    }
    public boolean prestarLibro(String titulo) {
        for (int i = 0; i < this.libros.length; i++) {
            if (titulo.equals(libros[i].getTitulo())) {
                return libros[i].prestamo();
            }
        }
        return false;
    }
    public boolean devolverLibro(String titulo) {
        for (int i = 0; i < this.libros.length; i++) {
            if (titulo.equals(libros[i].getTitulo())) {
                return libros[i].devolucion();
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre +
                "\nDireccion: " + barrio +
                "\nLibros: \n" + Arrays.toString(libros);

    }
}
