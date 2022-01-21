import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio2 {

	
	public static ArrayList<Integer> carrocompra = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		crearcarrocompra();
		

	}
	
	
	public static void crearcarrocompra() {
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos comprados"));
		for (int i = 0; i < cantidad; i++) {
			int precio = Integer.parseInt(JOptionPane.showInputDialog("Precio del producto " + (i+1)));
			carrocompra.add(precio);
		}
		mostrar();
	}
	
	public static double agregarIVA(int articulo, String seleccion) {
		double precioIVA = 0;
			switch (seleccion) {
			case "4%":
				precioIVA = articulo +(articulo * 0.04);
				break;
			case "21%":
				precioIVA = articulo +(articulo * 0.21);
				break;
			
			default:
				System.out.println("Introduce 4% o 21%");
				break;
			}
		return precioIVA;
	}
	
	public static void mostrar() {
		String EscribirIVA = JOptionPane.showInputDialog("Escribe el porcentaje de IVA(4% | 21%): ");
		for (int i = 0; i < carrocompra.size(); i++) {
			
			System.out.println("Articulo " + (i+1) + "  con precio bruto de " + carrocompra.get(i)+" y su precio con IVA " +agregarIVA(carrocompra.get(i), EscribirIVA));
		}
		System.out.println("Numero de articulos comprados: " + carrocompra.size());
		cobrar();
	}

	public static void cobrar() {
		int total = 0;
		for (int i = 0; i < carrocompra.size(); i++) {
			total = total + carrocompra.get(i);
		}
		System.out.println("Tienes que pagar: "+total);
		int pagar = Integer.parseInt(JOptionPane.showInputDialog("Cantidad pagada"));
		System.out.println("El cambio al cliente: "+ (pagar-total));
	}
}


