package Class;

import Base.Persona;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona {

    List<Libro> librosPermitidos;

    public Usuario(String nombre, String apellido) {
        super(nombre, apellido);
        this.librosPermitidos = new ArrayList<>();

    }

    @Override
    public void mostrarDatos() {
        System.out.println("Usuario: " + getNombre() + " " + getApellido());
    }
}