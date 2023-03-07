package EjemplosdeCodigo;

public class TiposDeIf {

	public static void main(String[] args) {
		
		// Ejemplo if normal
		int num = 5;
		if (num > 0) {
			System.out.println("El número es positivo");
		}
	
		// Ejemplo if-else (solo se cumple  1 de las condiciones)
		int num2 = 0;
		if (num2 > 0) {
			System.out.println("El número es positivo");
		} else if (num2 < 0) {
			System.out.println("El número es negativo");
		} else {
			System.out.println("El número es cero");
		}
		
		// Ejemplo if anidado
		int num1 = 10;
		if (num1 > 0) {
			if (num1 < 5) {
				System.out.println("El número es menor que 5");
			} else {
				System.out.println("El número es mayor o igual que 5");
			}
		} else {
			System.out.println("El número es negativo o cero");
		}
	}

}
