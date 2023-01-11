public class BibliotecaTester {
    public static void main(String[] args) {
        Biblioteca biblio1 = new Biblioteca("eloy","lliria");
        Biblioteca biblio2 = new Biblioteca("javi","pobla");
        biblio1.agregarLibro("titulo1","autor1",10);
        biblio1.agregarLibro("titulo2","autor2",10);
        biblio1.agregarLibro("titulo3","autor3",10);
        biblio1.agregarLibro("titulo4","autor4",10);
        biblio1.agregarLibro("titulo5","autor5",10);
        System.out.println(biblio1);
    }
}