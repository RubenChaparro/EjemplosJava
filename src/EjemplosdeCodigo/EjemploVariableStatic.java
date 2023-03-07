package EjemplosdeCodigo;

/* 
 En este ejemplo, la variable saldo es una variable de instancia (no estática) 
 
 que almacena el saldo actual de la cuenta bancaria. La variable numeroDeCuentas 
 es una variable estática que lleva la cuenta del número total de cuentas bancarias 
 creadas en la aplicación.

En el constructor de la clase, cada vez que se crea una nueva instancia de CuentaBancaria, 
se incrementa el valor de la variable estática numeroDeCuentas. Esto permite conocer en 
cualquier momento el número total de cuentas bancarias creadas.

El método obtenerNumeroDeCuentas() es un método estático que devuelve el valor actual de 
la variable estática numeroDeCuentas. Este método puede ser invocado sin la necesidad de 
crear una instancia de la clase CuentaBancaria.

El resto de los métodos (depositar(), retirar() y obtenerSaldo()) son métodos de instancia 
que operan sobre la variable de instancia saldo.

En resumen, este ejemplo muestra cómo una variable estática puede ser utilizada para mantener 
información global de una clase, mientras que las variables de instancia son utilizadas para 
mantener información específica de cada objeto de la clase.

*/


public class EjemploVariableStatic {
	
	    private static int numeroDeCuentas = 0;
	    private double saldo;

	    public EjemploVariableStatic(double saldoInicial) {
	        this.saldo = saldoInicial;
	        numeroDeCuentas++;
	    }

	    public void depositar(double cantidad) {
	        saldo += cantidad;
	    }

	    public void retirar(double cantidad) {
	        if (cantidad > saldo) {
	            System.out.println("Error: Saldo insuficiente.");
	        } else {
	            saldo -= cantidad;
	        }
	    }

	    public double obtenerSaldo() {
	        return saldo;
	    }

	    public static int obtenerNumeroDeCuentas() {
	        return numeroDeCuentas;
	    }
	}
