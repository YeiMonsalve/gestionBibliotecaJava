package Interfaces;

import Class.Usuario;
import Class.Libro;

public interface Gestionable {
    void prestarLibro(Usuario usuario, Libro libro);
    void devolverLibro(Usuario usuario, Libro libro);
}
