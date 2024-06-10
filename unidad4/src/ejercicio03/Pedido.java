package ejercicio03;

public class Pedido extends Documentos{
	
	int nProductos;

	public Pedido(long id, int nProductos) {
		super(id);
		this.nProductos = nProductos;
	}

	public int getnProductos() {
		return nProductos;
	}

	public void setnProductos(int nProductos) {
		this.nProductos = nProductos;
	}

	@Override
	public String toString() {
		return super.toString()+"Pedido [nProductos=" + nProductos + "]";
	}
	
	

}
