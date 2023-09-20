package TP2ControlGastos;

public class Provincia {
    private String nombre;
    private Ciudad[] ciudades;

    public Provincia(String nombre, int cantCiudades) {
        this.setNombre(nombre);
        this.ciudades = new Ciudad[cantCiudades];
    }

    public boolean mitadProvEnDeficit() {
        boolean deficit;
        int ciudadesEnDeficit = 0, ciudadesTotales = 0;
        for (int i = 0; i < ciudades.length; i++) {
            if (ciudades[i] != null) {
                ciudadesTotales++;
                if (ciudades[i].estaEnDeficit()) {
                    ciudadesEnDeficit++;
                }
            }
        }
        return ciudadesEnDeficit>ciudadesTotales/2;
    }

    public int cantidadCiudadesEnDeficit() {
        int contador = 0;
        for (int i = 0; i < ciudades.length; i++) {
            if (ciudades[i].getHabitantes() > 100000) {
                if (ciudades[i].estaEnDeficit()) ;
                contador++;
                System.out.println(ciudades[i].getNombre());
                ;
            }
        }
        return contador;
    }


    public void agregarCiudad(int pos, Ciudad ciudad) {
        if (pos >= 0 && pos < ciudades.length && ciudades[pos] == null && ciudad != null) {
            this.ciudades[pos] = ciudad;
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad[] getCiudades() {
        return ciudades;
    }

    public void setCiudades(Ciudad[] ciudades) {
        this.ciudades = ciudades;
    }
}
