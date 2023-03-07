package EjemplosdeCodigo;

/*

En este ejemplo, se utiliza la estructura switch para determinar el impuesto correspondiente 
a cada país y el descuento correspondiente a cada tipo de producto.

En el primer switch, se asigna el valor correspondiente a la variable impuesto en función del 
país de origen del producto. Si el país no coincide con ninguno de los casos definidos, se asigna 
el valor 0.0 a la variable impuesto.

En el segundo switch, se asigna el valor correspondiente a la variable descuento en función del 
tipo de producto. Si el tipo de producto no coincide con ninguno de los casos definidos, se 
asigna el valor 0.0 a la variable descuento.

Finalmente, se calcula el precio final del producto utilizando la fórmula correspondiente y se 
imprime el resultado utilizando la instrucción System.out.println(). Como se puede ver, la 
estructura switch es muy útil para simplificar la lógica de programación en casos donde se 
necesitan tomar decisiones complejas en función de varias condiciones.

*/
public class Switch {

	public static void main(String[] args) {
		String paisOrigen = "México";
		String tipoProducto = "Electrónico";
		double precio = 100.0;
		double impuesto;
		double descuento;

		switch (paisOrigen) {
		case "México":
			impuesto = 0.16;
			break;
		case "Estados Unidos":
			impuesto = 0.08;
			break;
		case "Canadá":
			impuesto = 0.12;
			break;
		default:
			impuesto = 0.0;
		}

		switch (tipoProducto) {
		case "Electrónico":
			descuento = 0.05;
			break;
		case "Ropa":
			descuento = 0.1;
			break;
		case "Alimentos":
			descuento = 0.02;
			break;
		default:
			descuento = 0.0;
		}

		double precioConImpuesto = precio + (precio * impuesto);
		double precioConDescuento = precioConImpuesto - (precioConImpuesto * descuento);

		System.out.println("El precio del producto es: " + precio);
		System.out.println("El impuesto correspondiente es: " + impuesto);
		System.out.println("El descuento correspondiente es: " + descuento);
		System.out.println("El precio final con impuesto y descuento es: " + precioConDescuento);

	}

}
