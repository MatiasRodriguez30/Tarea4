import java.time.LocalDate;

public class Producto {
    private String nombre;
    private String description;
    private LocalDate fechaAlta;
    private Integer pesoKg;
    private Double precio;
    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.fechaAlta= LocalDate.now();
        this.precio=precio;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Integer getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(Integer pesoKg) {
        this.pesoKg = pesoKg;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
