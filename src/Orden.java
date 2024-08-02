public class Orden {

    private final int idOrden;
    private Producto[] productos;
    private static int contadorOrdenes;
    private static final int MAX_PRODUCTOS = 10;
    private int contadorProductos;


    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }


    public void agregarProducto(Producto producto){
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        }else 
        System.out.println("Se ha superador el maximo de productos: " +
        Orden.MAX_PRODUCTOS);
        
    }

    public double CalcularTotal(){

        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
          /*   var producto = this.productos[i];
            total = this.productos[i].getPrecio();  */

            total += this.productos[i].getPrecio();
        }
        return total;

    }
    public void mostrarOrden(){
        System.out.println("ID Orden: " + this.idOrden);
        var totalOrden = this.CalcularTotal();
        System.out.println("\t total de la orden: $" + totalOrden);
        System.out.println("\t Productos de la orden: ");

        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println("\t\t" + this.productos[i]);
        }


    }
    
}
