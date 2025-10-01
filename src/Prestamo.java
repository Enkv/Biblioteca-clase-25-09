import java.util.Date;

public class Prestamo {
    private static Long nextId = 0L;
    private Long idPrestamo;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Estado estado;
    private Usuario usuario;
    private Libro libro;

    public Prestamo() {

    }

    public Prestamo(Date fechaPrestamo, Date fechaDevolucion, Estado estado, Usuario usuario, Libro libro) {
        this.idPrestamo = nextId++;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
        this.usuario = usuario;
        this.libro = libro;
    }

    public Prestamo(Date fechaPrestamo, Estado estado, Usuario usuario, Libro libro) {
        this.idPrestamo = nextId++;
        this.fechaPrestamo = fechaPrestamo;
        this.estado = estado;
        this.usuario = usuario;
        this.libro = libro;
    }

    public Long getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Long idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}