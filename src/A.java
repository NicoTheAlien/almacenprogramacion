
public class A {
	private int codigo;
	private String descripcion;
	private int pcompra;
	private int pventa;
	private int stock;
	public A(int codigo, String descripcion, int pcompra, int pventa, int stock) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.pcompra = pcompra;
		this.pventa = pventa;
		this.stock = stock;
	}
	public String toString() {
		String cadena = "-----------------------------------";
		cadena+="\nCodi: " + this.codigo;
		cadena+="\nDescripcion: "+ this.descripcion;
		cadena+="\nPrecio de compra: "+ this.pcompra;
		cadena+="\nPrecio de venta: "+ this.pventa;
		cadena+="\nStock: "+ this.stock;
		cadena+="\n---------------------------------------";
		return cadena;
	}
}
