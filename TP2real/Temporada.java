package TP2real;

public class Temporada {
    private String nombre;
    private Episodio[] episodios;

    public Temporada(String nombre, int episodios){
        this.setNombre(nombre);
        this.episodios = new Episodio[episodios];
    }

    public double obtenerPromedioCalificaciones(){
        int total = 0;
        for(int i = 0;i<episodios.length;i++){
            total+=episodios[i].getCalificacion();
        }
        return total/episodios.length;
    }

    public boolean vioTodos(){
        boolean vioTodos = true;
        for (int i = 0; i < episodios.length; i++) {
            if(episodios[i].getCalificacion() == -1){
                vioTodos = false;
                break;
            }
        }
        return vioTodos;
    }

    public void agregarEpisodio(int pos, Episodio episodio){
        if(pos>=0 && pos<episodios.length && episodio != null&& episodios[pos]== null){
            episodios[pos] = episodio;
        }
    }
    public void editarEpisodio(int pos, Episodio episodio){
        if(pos>=0 && pos<episodios.length && episodio != null && episodios[pos]!=null){
            episodios[pos] = episodio;
        }
    }



    public int obtenerCantidadDeEpVistos(){
        int cantidad = 0;
        for (int i = 0; i < episodios.length; i++) {
            if(episodios[i].isFlag()) {
                cantidad++;
            }
        }
        return cantidad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Episodio[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(Episodio[] episodios) {
        this.episodios = episodios;
    }
}
