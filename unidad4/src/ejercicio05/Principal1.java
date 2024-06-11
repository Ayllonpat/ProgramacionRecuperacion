package ejercicio05;

public class Principal1 {
	/*
	 *  Ummm, viendo el programa de “El xef” de David Muñoz, me hubiera gustado tener un restaurante de alta cocina.
		Viendo cómo trabajan los hermanos del Celler de can Roca (mejor restaurante del mundo) creo que el cálculo de los
		sueldos debe ser una locura. Intentemos hacer un programa para calcular dichos sueldos.
		
		Partiremos de una clase general llamada Trabajador. Estos se caracterizan por el nombre, número de cuenta, sueldo base
		y años trabajados.
		
		El sueldo de cualquier trabajador, en general, se calcula sumando al sueldo base 10 € por cada año trabajado.
		En el restaurante existen trabajadores “genéricos” y además, trabajadores especializados en una cosa. Cada uno tiene sus
		características propias:
		
		- El ayudante de cocina se caracteriza por la cantidad de horas extra que trabaja.
		- El Chef (para el que no cuentan las horas, está allí siempre) se caracteriza por su especialidad, por ejemplo, pastelero,
			comida asiática, encargado del wok, etc. Puede ser un String.
		- Los camareros, se caracterizan por las propinas recibidas (no se reparten las propinas y no se tienen en cuenta las horas)
			y el número de clientes atendidos.
			Así, con esta diferenciación, el sueldo de cada uno se obtiene como el sueldo base de un trabajador más los 10 € por año
			trabajado más:
			
				- 20 € por cada hora extra para los ayudantes de cocina.
				- El chef, suma a su sueldo como trabajador, 4 € por plato cocinado.
				- Los camareros suman a su sueldo como trabajador lo ganado en propinas más 2 € por cada cliente atendido.
		
		Crear una clase Restaurante cuya única característica será el nombre del restaurante (por si abren más en otros lugares) y
		añadir los métodos calcularPaga (Trabajador t) y calcularGastoNominas (Trabajador [ ] listaTrabajadores).
		
		Use los atributos y métodos necesarios que permitan calcular el sueldo de cualquier tipo de Trabajador, tanto general
		como especiales usando adecuadamente el polimorfismo, mediante la sobreescritura del método cacularSueldo. Para
		probar esto, se debe trabajar con un array en cuyo interior se guarde, al menos, un trabajador de cada tipo (incluidos los
		trabajadores generales) y realizar todas las operaciones básicas, es decir, mostrar datos con toString ( ), calcular el sueldo
		de un trabajador y lo gastotado en nóminas de todos pasando como parámetro el array.
		
		Se pueden crear los objetos directamente en el main con los valores como parámetros o crear un método “cargarDatos”
		que devuelva el array relleno directamente.
		
		Además, se debe añadir el método mostrarHorasExtras solo en la clase Ayudante que muestre un mensaje en pantalla, si
		el número de horas extras de un ayudante de cocina supera las 10 horas cuando en el listado de trabajadores haya un
		objeto del tipo Ayudante (usando instanceof y casting).
		
		Probar todo en una clase principal mostrando claramente todos los cálculos.
		
		NOTA: No es necesario gestionar los clientes, lo que paga cada cliente, las mesas, etc.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam=3;
		
		Trabajador t1=new AyudanteCocina("Pepe", "1A", 1200.45, 3, 22);
		Trabajador t2=new Chef("Maria", "2B", 2300.55, 8, "Postres");
		Trabajador t3=new Camarero("David", "3C", 1101.65, 2, 36.89, 100);
		Trabajador t=new Trabajador("Ivan", "4D", 900, 1);
		
		Trabajador listaTrabajadores[]= new Trabajador[tam];
		
		Restaurante r=new Restaurante("a");
		
		listaTrabajadores[0]=t1;
		listaTrabajadores[1]=t2;
		listaTrabajadores[2]=t3;
		listaTrabajadores[2]=t;
		
		
	}

}
