public class Libro {
    private final String titulo;
    private final String autor;
    private final int ejemplares;
    private int prestados;

    public Libro(String titulo, String autor, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public boolean prestamo() {
        if (prestados<=ejemplares){
            this.prestados++;
            return true;
        }
        return false;
    }
    public boolean devolucion() {
        if (prestados>=0){
            this.prestados--;
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "Libro: " + titulo +
                "\nAutor: " + autor +
                "\nEjemplares: " + ejemplares +
                "\nPrestados: " + prestados + "\n";
    }
}
