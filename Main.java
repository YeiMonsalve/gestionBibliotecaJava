import Class.Libro;
import Class.Bibliotecario;
import Class.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Libro> listaDeLibros = new ArrayList<>();

        // Crear libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1, true);
        Libro libro2 = new Libro("Looking for Alaska", "Jhon Green", 2, true);

        listaDeLibros.add(libro1);
        listaDeLibros.add(libro2);

        System.out.println("Hay " + listaDeLibros.size()+ " Libros Prestados");

        // Crear usuario
        Usuario usuario = new Usuario("Yeison", "Monsalve");

        // Crear bibliotecario
        Bibliotecario bibliotecario = new Bibliotecario("Ana", "Gómez");

        // Mostrar datos
        usuario.mostrarDatos();
        bibliotecario.mostrarDatos();

        // Prestar libros
        bibliotecario.prestarLibro(usuario, libro1);
        bibliotecario.prestarLibro(usuario, libro2);

        // Devolver libro
        bibliotecario.devolverLibro(usuario, libro1);
    }
}