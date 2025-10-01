public class Usuario {
    private static long nextId = 0L;
    private Long idUsuario;
    private String rut;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Usuario() {
    }



    public Usuario(String rut, String nombre, String apellido, String email) {
        this.idUsuario = nextId++;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
