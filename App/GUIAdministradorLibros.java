import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GUIAdministradorLibros {
    private JFrame frame;
    private AdministradorLibros admin;
    
    public GUIAdministradorLibros() {
        frame = new JFrame("Administrador de Libros");
        admin = new AdministradorLibros();
        
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menu = new JMenu("Opciones");
        JMenuItem agregarItem = new JMenuItem("Agregar libro");
        JMenuItem eliminarItem = new JMenuItem("Eliminar libro por ISBN");
        JMenuItem mostrarItem = new JMenuItem("Mostrar todos los libros");
        JMenuItem salir = new JMenuItem("Salir");
        
        menu.add(agregarItem);
        menu.add(eliminarItem);
        menu.add(mostrarItem);
        menu.add(salir);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        
        agregarItem.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Libro nuevoLibro = new Libro("Harry Potter", "J.K.", "178139");
                admin.agregarLibro(nuevoLibro);
                Libro nuevoLibro1 = new Libro("Harry Potter 4", "J.K.", "178138");
                admin.agregarLibro(nuevoLibro1);
                // Lógica para agregar libro...
            }
        });
        
        eliminarItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                admin.eliminarLibroPorISBN("178139");

                // Lógica para eliminar libro por ISBN...
            }
        });
        
        mostrarItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                admin.mostrarLibros();
                // Lógica para mostrar todos los libros...
            }
        });
        
        salir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                
            }
        });

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}