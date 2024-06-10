package ejercicio03;

public class Documentos {
	
	long id;

	public Documentos(long id) {
		super();
		this.id = id;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Documentos [id=" + id + "]";
	}
	
	public void mostrarDatos() {
		System.out.println(toString());
	}
	
}
