package ejeercicio06;

public class Principal {
	/*
	 * 6. En las películas de ciencia ficción existen muchos tipos de vehículos y siempre me he preguntado cómo sería tener uno.
		Me gustaría montar una empresa que se dedique a alquilar este tipo de vehículos. Os cuento que debería hacer el programa:
		Deberían poderse alquilar vehículos genéricos y otros de distinto tipo “especial”.
		Para cada ALQUILER se guarda el nombre de la persona que lo hace, su DNI y el número de días de alquiler.
		Un VEHÍCULO genérico se caracteriza por su matrícula, su tamaño en metros y año de fabricación.
		El precio de un alquiler de un vehículo genérico se calcula multiplicando su tamaño en metros por el año de fabricación.
		Esta cantidad serían céntimos por lo que hay que dividirla por cien para dar el precio en euros.
		Sin embargo ahora se pretende diferenciar la información de algunos tipos de vehículos “especiales”:
		• Número de ruedas para Batmóviles.
		• Potencia en caballos para patinetes voladores de regreso al futuro.
		El alquiler de los vehículos de un tipo especial se obtiene como el de uno normal más:
		ü El 10 % del número de ruedas para Batmóviles pasado a euros, es decir, ese número resultante de aplicar el %
		es el número de euros que hay que sumar.
		ü Un euro por cada caballo para patinetes del regreso al futuro.
		Cree una clase Alquiler con un único atributo que será un array de tipo Vehiculo y tendrá los siguientes métodos:
		* calcularAlquilerUnVehiculo (Vehiculo v);
		* mostrarListado ( ) mostrando todos los datos de todos los objetos y que cuando en el listado aparezca un patinete se
		muestre el mensaje de “¡Cuidado, patinete tuneado!”. Para ello, se debe tener un método solo en la clase Patinete llamado
		avisarPatinete ( ), que muestre dicho mensaje solo cuando el número de caballos del patinete sea superior a 20.
		* calcularTotalRecaudado ( );
		Para probar todo esto, se debe crear en el main un array en cuyo interior se guarde, al menos, un vehículo de cada tipo
		(incluidos los vehiculos en general) y realizar mostrar las siguientes cosas:
		• Mostrar el total recaudado por los alquileres de todos los vehículos.
		• Mostrar los datos de todos los objetos guardados en el array con su aviso para patinetes.
		• Calcular el precio de un alquiler pidiendo al usuario que diga de qué vehículo quiere ver el precio (se puede
		mostrar la lista y que el usuario diga por teclado en q
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
