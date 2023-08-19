import java.util.ArrayList;

class AdministradorLibros {
    private ArrayList<Libro> biblioteca = new ArrayList<>();
    public void agregarLibro(Libro libro){
        biblioteca.add(0, libro);
    }

    public void eliminarLibroPorISBN(String ISBN){
        for (int i = 0; i < biblioteca.size(); i++) {
            if(biblioteca.get(i).getISBN() == ISBN){
                biblioteca.remove(i);
            }
        }
    }
    public void mostrarLibros(){
        for (int i = 0; i < biblioteca.size(); i++) {
        System.out.println(biblioteca.get(i).toString());
        }
    }
    // Métodos agregarLibro, eliminarLibroPorISBN, mostrarLibros...
}
