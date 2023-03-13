package Clases;

/**
 *
 * @author jonat
 */
public class Producto {
    private int id, cantidad, idCategoria, PorcentajeIva, estado;
    private String nombre, descripcion;
    private float precio;
    
    //Constructor con valores vacios
    public Producto(){
        this.id = 0;
        this.cantidad = 0;
        this.idCategoria = 0;
        this.nombre = "";
        this.descripcion = "";
        this.precio = 0;
        this.PorcentajeIva= 0;
        this.estado = 0;
    }
    
    //Construcor sobrecargado
    public Producto(int id, int cantidad, int idCategoria, String nombre, String descripcion, float precio, byte iva, byte estado) {
        this.id = id;
        this.cantidad = cantidad;
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.PorcentajeIva = iva;
        this.estado = estado;
    }
    
    //Metodos GET y SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getPorcentajeIva() {
        return PorcentajeIva;
    }

    public void setPorcentajeIva(int iva) {
        this.PorcentajeIva = iva;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    

   
}
