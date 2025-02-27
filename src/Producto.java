public class Producto {

    private final int idProducto;
    private String nombre;
    private int precio;
    private static int contadorProducto;


    public Producto(String nombre, int precio) {
        this.idProducto = ++Producto.contadorProducto;
        this.nombre = nombre;
        this.precio = precio;
    }


    public int getIdProducto() {
        return idProducto;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getPrecio() {
        return precio;
    }


    public void setPrecio(int precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + "]";
    }


    

    

}
