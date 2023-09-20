package TP2AgendaPersonal;

public class Usuario {
    //atributos
    private String nombre, mail,telefono;
    private boolean esAsistente;

    //constructor
    public Usuario(String nombre,String mail, String telefono, boolean esAsistente){
        this.setNombre(nombre);
        this.setMail(mail);
        this.setTelefono(telefono);
        this.isEsAsistente(esAsistente);
    }

//geterss and setters
    public boolean isEsAsistente(boolean esAsistente) {
        return this.esAsistente;
    }

    public void setEsAsistente(boolean esAsistente) {
        this.esAsistente = esAsistente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //metodos
}
