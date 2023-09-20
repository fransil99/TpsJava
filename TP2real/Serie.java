package TP2real;

public class Serie {

    private String titulo, descripcion, creador, genero;
    private Temporada[] temporadas;

    public Serie(String titulo, String descripcion, String creador, String genero, int temporadas) {
        this.setTitulo(titulo);
        this.setDescripcion(descripcion);
        this.setCreador(creador);
        this.setGenero(genero);
        this.temporadas = new Temporada[temporadas];

    }

    public void agregarTemporada(int pos, Temporada temporada) {
        if (pos >= 0 && pos < temporadas.length && temporada != null && temporadas[pos] == null) {
            temporadas[pos] = temporada;
        }
    }

    public int obtenerCantEpVistosDeLaSerie() {
        int cantidad = 0;
        for (int i = 0; i < temporadas.length; i++) {
            cantidad += temporadas[i].obtenerCantidadDeEpVistos();
        }
        return cantidad;
    }

    public int obtenerPromedioCalificaciones() {
        int total = 0;
        for (int i = 0; i < temporadas.length; i++) {
            total += temporadas[i].obtenerPromedioCalificaciones();
        }
        return total;
    }

    public boolean vioTodos() {
        boolean vioTodos = true;
        for (int i = 0; i < temporadas.length; i++) {
            if (temporadas[i].vioTodos() != true) {
                vioTodos = false;
            }
        }
        return vioTodos;
    }


    public void editasTemporada(int pos, Temporada temporada) {
        if (pos >= 0 && pos < temporadas.length && temporada != null && temporadas[pos] != null) {
            temporadas[pos] = temporada;
        }
    }


    public Temporada[] getTemporadas() {
        return temporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
