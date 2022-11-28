package cl.ejemplos.agenda.modelo;

public class Persona {
    private String uid;
    private String nombrecompleto;
    private String direccion;
    private String correoelectronico;
    private String contrasena;

    public Persona() {
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNombre() {
        return nombrecompleto;
    }

    public void setNombre(String nombre) {
        this.nombrecompleto = nombre;
    }

    public String getApellido() {
        return direccion;
    }

    public void setApellido(String apellido) {
        this.direccion = apellido;
    }

    public String getCorreo() {
        return correoelectronico;
    }

    public void setCorreo(String correo) {
        this.correoelectronico = correo;
    }

    public String getPassword() {
        return contrasena;
    }

    public void setPassword(String password) {
        this.contrasena = password;
    }

    @Override
    public String toString() {
        return nombrecompleto;
    }
}
