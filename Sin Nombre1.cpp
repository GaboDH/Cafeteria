#include <stdio.h>
#include <math.h>

int main() {
    char nombre[50];
    char producto[50];
    float precio;
    int cantidad;
    float dineroEntregado;
    float subtotal ;
    float descuento ;
    float total;
    float cambio;

    printf("=== COMPRA EN LA CAFETERIA UNIVERSITARIA ===\n");

    printf("Ingrese su nombre: ");
    scanf(" %[^\n]", nombre);

    printf("Ingrese el nombre del producto: ");
    scanf(" %[^\n]", producto);

    printf("Ingrese el precio unitario: $");
    scanf("%f", &precio);

    printf("Ingrese la cantidad: ");
    scanf("%d", &cantidad);

    printf("Ingrese el dinero entregado: $");
    scanf("%f", &dineroEntregado);

    subtotal = precio * cantidad;
    descuento = subtotal * 0.10;
    total = subtotal - descuento;
    cambio = dineroEntregado - total;

    printf("\n=== FACTURA ===\n");
    printf("Cliente: %s\n", nombre);
    printf("Producto: %s\n", producto);
    printf("Cantidad: %d\n", cantidad);
    printf("Subtotal: $%.2f\n", subtotal);
    printf("Descuento 10%%: -$%.2f\n", descuento);
    printf("TOTAL A PAGAR: $%.2f\n", total);

    if (dineroEntregado >= total) {
        printf("Cambio: $%.2f\n", cambio);
        printf("Pago realizado con exito :)\n");
    } else {
        printf("Faltante: $%.2f\n", fabs(cambio));
        printf("El dinero entregado NO cubre el pago :(\n");
    }

    return 0;
}
