import java.util.Scanner;

public class descuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // ENTRADAS
        System.out.println("=== COMPRA EN LA CAFETERIA UNIVERSITARIA ===");
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese el nombre del producto: ");
        String producto = sc.nextLine();
        
        System.out.print("Ingrese el precio unitario: $");
        double precio = sc.nextDouble();
        
        System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();
        
        System.out.print("Ingrese el dinero entregado: $");
        double dineroEntregado = sc.nextDouble();
        
        // PROCESO
        double subtotal = precio * cantidad;
        double descuento = subtotal * 0.10; // Descuento del 10%
        double total = subtotal - descuento;
        double cambio = dineroEntregado - total;
        
        // SALIDAS
        System.out.println("\n=== FACTURA ===");
        System.out.println("Cliente: " + nombre);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento 10%: -$" + descuento);
        System.out.println("TOTAL A PAGAR: $" + total);
        
        // Comprobar si el dinero cubre el pago
        if (dineroEntregado >= total) {
            System.out.println("Cambio: $" + cambio);
            System.out.println("Pago realizado con éxito :)");
        } else {
            System.out.println("Faltante: $" + Math.abs(cambio));
            System.out.println("El dinero entregado NO cubre el pago :(");
        }
        
        sc.close();
    }
}
