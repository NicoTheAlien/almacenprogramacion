import java.util.Scanner;

public class articulo {
		private static int codigo;
		private static String descripcion;
		private static int pcompra;
		private static int pventa;
		private static int stock;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}


    private static A[] listaA = new A[40];
    private static int contador = 0;

	    public static void AltaNueva() {
	    	Scanner s= new Scanner(System.in);
	    	System.out.println("Ha seleccionado la opci�n Alta de mercanc�a.");
	    	System.out.println("Especifique el c�digo del art�culo.");
			codigo = s.nextInt();
			System.out.println("A�ada una descripci�n del art�culo.");
			descripcion = s.nextLine();
			System.out.println("Especifique el precio de compra.");
			pcompra = s.nextInt();
			System.out.println("Especifique el precio de venta.");
			pventa = s.nextInt();
			System.out.println("Especifique el stock del art�culo.");
	        A nuevo = new A(codigo, descripcion, pcompra, pventa, stock);
	        listaA[contador] = nuevo;
	        System.out.println("Se ha insertado el elemento "+contador+ " en la lista. Sus valores son: " + nuevo.toString());
	        contador++;
	    }
		public A[] getListaA() {
			return listaA;
		}
		public void setListaA(A[] listaA) {
			this.listaA = listaA;
		}
		public int getContador() {
			return contador;
		}
		public void setContador(int contador) {
			this.contador = contador;
		}
	}
