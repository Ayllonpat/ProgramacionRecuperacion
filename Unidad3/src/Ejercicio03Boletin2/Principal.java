package Ejercicio03Boletin2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Vamos a intentar modelar a un vendedor "callejero" móviles. Los atributos de la clase Móvil serán, como
mínimo, marca, modelo, vendido o no, nuevo o de segunda mano y precio unitario. En la clase Vendedor
tendremos como características un array de Móviles y total vendido (se pueden añadir más atributos si se
quiere o precisa). Se deben crear métodos que hagan las siguientes operaciones:

	- Comprobar cuántos móviles le quedan sin vender.
	- Mostrar precio final de un producto haciendo algún descuento al precio unitario si es de segunda mano.
	- Podemos incluir también, si se quiere, la posibilidad de ofrecer cambio.
	- Calcular cuánto dinero se debe tener en el bolsillo cuando se hayan vendido todos los móviles.
	
	Escribir también una clase de prueba para hacer todas las operaciones.
 */
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int opcion=0;
		double totalVendido = 0;
		int nMoviles = 0;
		double dineroBolsillo = 0;
		int tam=3;
		String modelo;
		
		Movil[] listaMoviles = new Movil[tam];
		
		Movil m1=new Movil("Samsumg", "A5", false, false, 145.67);
		Movil m2=new Movil("Samsumg", "A6", false, true, 145.67);
		Movil m3=new Movil("Samsumg", "A7", true, true, 145.67);
		
		listaMoviles[0]=m1;
		listaMoviles[1]=m2;
		listaMoviles[2]=m3;
		
		Vendedor v= new Vendedor(listaMoviles, totalVendido, nMoviles, dineroBolsillo);
		

		
		System.out.println("""
				BIENVENIDO AL PROGRAMA
				-------------------------------------------
				""");
		do {
			
			System.out.println("""
					\nElija una opción:
					
						1.Comprobar cuántos móviles le quedan sin vender
						2.Mostrar precio final producto
						3.Cambio a dar
						4.Dinero en bolsillo
						0.Salir
					""");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 1:
					System.out.println(v.comprobarMovilesSinVender());					
					break;
				case 2:
					System.out.println("Indique el modelo");
					modelo=sc.nextLine();
					System.out.println(v.precioPorProducto(modelo));
					break;
				case 3:
					break;
				case 4:
					break;
				case 0:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("OPCION NO DISPONIBLE");
					break;
			
			}
			
		}while(opcion!=0);
	}

}
