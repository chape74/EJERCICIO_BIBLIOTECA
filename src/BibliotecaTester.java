public class BibliotecaTester {
    public static void main(String[] args) {
        //Crea dos bibliotecas al menos.
        Biblioteca[] biblioteca = new Biblioteca[2];
        biblioteca[0] = new Biblioteca("Eloy", "Liria");
        biblioteca[1] = new Biblioteca("Javi", "Puebla");


        //Añade 5 libros a una de las bibliotecas
        System.out.println("Pruebas:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ":" + biblioteca[0].agregarLibro("titulo" + i, "autor" + i, 10) + " ");
        }
        System.out.println();


        System.out.println(
                        //elimina de la otra el primero
                        "6:" + biblioteca[1].eliminarLibro("Don Quijote de la Mancha") + " " +
                        //el último
                        "7:" + biblioteca[1].eliminarLibro("El amor en los tiempos del cólera") + " " +
                        //uno que no sea el primero ni el ultimo
                        "8:" + biblioteca[1].eliminarLibro("La casa de los espíritus") + " " +
                        //e intenta eliminar uno que no exista
                        "9:" + biblioteca[1].eliminarLibro("Pinocho") + " " +
                        //Crea préstamos y devoluciones de libros de cada una de las bibliotecas
                        "10:" + biblioteca[0].prestarLibro("titulo1") + " " +
                        "11:" + biblioteca[0].prestarLibro("titulo1") + " " +
                        "12:" + biblioteca[0].devolverLibro("titulo1")
        );


        //Crea préstamos y devoluciones de libros de cada una de las bibliotecas
        //Probando límite de prestar
        for (int i = 13; i < 18; i++) {
            System.out.print(i + ":" + biblioteca[1].prestarLibro("Cien años de soledad") + " ");
        }
        System.out.println();


        //Crea préstamos y devoluciones de libros de cada una de las bibliotecas
        //Probando límite de devolver
        for (int i = 18; i <= 20; i++) {
            System.out.print(i + ":" + biblioteca[1].devolverLibro("El Aleph") + " ");
        }
        System.out.println("\n");


        //Por último, mostrar la información de cada objeto biblioteca.
        for (Biblioteca i : biblioteca) {
            System.out.println(i);
        }
    }
}