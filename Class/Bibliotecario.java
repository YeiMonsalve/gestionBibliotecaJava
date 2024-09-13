package Class;

import Base.Persona;
import Interfaces.Gestionable;

public class Bibliotecario extends Persona implements Gestionable {


    public Bibliotecario(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Bibliotecario: " + getNombre() + " " + getApellido());
    }

    @Override
    public void prestarLibro(Usuario usuario, Libro libro) {
        if (usuario.librosPermitidos.size() > 3) {
            System.out.println("No se le pueden prestar más libros, ya tiene el máximo permitido");
        } else {
            libro.prestar();
            usuario.librosPermitidos.add(libro);
            System.out.println("Usuario: " + usuario.getNombre() + " " + usuario.getApellido() + " prestó el libro " + libro.getTitulo());
        }
    }

    @Override
    public void devolverLibro(Usuario usuario, Libro libro) {
        usuario.librosPermitidos.remove(libro.getIsbn());
        System.out.println("El usuario ha devuelto el libro: " + libro.getTitulo());
    }
}