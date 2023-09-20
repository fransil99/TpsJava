package TP2ControlGastos;

public class Pais {
    private String nombre;
    private Provincia[] provincias;

    public Pais(String nombre, int provincias){
        this.setNombre(nombre);
        this.provincias = new Provincia[provincias];
    }

    public int provinciasEnDeficit(){
        int cantProvEnDeficit = 0;
        for (int i = 0; i < provincias.length; i++) {
            if(provincias[i].mitadProvEnDeficit())
                cantProvEnDeficit++;
        }
        return cantProvEnDeficit;
    }

    public void agregarProvincia(int pos, Provincia provincia){
        if(pos>=0&&pos< provincias.length&&provincias[pos]==null&&provincia!=null){
            this.provincias[pos] = provincia;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Provincia[] getProvincias() {
        return provincias;
    }

    public void setProvincias(Provincia[] provincias) {
        this.provincias = provincias;
    }
}
