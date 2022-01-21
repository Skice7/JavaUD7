import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Ejercicio4 {
	public static ArrayList<Integer> carrocompra = new ArrayList<Integer>();
	public static Hashtable<String, int[]> articulos = new Hashtable<String, int[]>();

	public static void main(String[] args) {

		menu();

	}

	public static void menu() {

		String seleccion = "";
		do {

			String seleccionar = JOptionPane.showInputDialog(
					"Escribe una opción \n Opcion1: comprar \n Opcion2: añadir \n Opción3: mostrar \n Opción4: finalizar ");
			switch (seleccionar) {
			case "comprar":
				crearcarrocompra();
				break;
			case "añadir":
				addArticulos();
				break;
			case "mostrar":
				mostrarArticulos();
				break;
			case "finalizar":
				System.exit(1);
				break;

			default:
				break;
			}

		} while (seleccion != "finalizar");
	}

	public static void articulos() {

		String productos[] = { "Manzanas", "Peras", "Platanos", "Tomates", "Chirimoyas", "Fresas", "Frambuesas","Granadas", "Naranjas", "Higos" };
		for (int i = 0; i < 10; i++) {
			int array[] = new int[2];
			articulos.put(productos[i], array);
			for (int j = 0; j < 2; j++) {
				double random = Math.random() * (20 - 1) + 0;
				array[j] = (int) random;
			}
		}

	}

	public static void addArticulos() {
		String articulo = JOptionPane.showInputDialog("Dime el nombre del producto");
		
		int precio = Integer.parseInt(JOptionPane.showInputDialog("Dime el precio del producto"));
		
		int cant = Integer.parseInt(JOptionPane.showInputDialog("Dime la cantidad del producto"));
		
		int array[] = new int[2];
		array[0] = precio;
		array[1] = cant;
		articulos.put(articulo, array);
	}

	public static void mostrarArticulos() {

		articulos();
		for (String y : articulos.keySet()) {
			int[] mostrar = articulos.get(y).clone();
			System.out.println("Articulo: " + y + " "
					+ "|| precio: " + mostrar[0] + " "
					+ "|| cantidad en stock: " + mostrar[1]);

		}
		System.out.println("");

	}
	
	public static void crearcarrocompra() {
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos comprados"));
		for (int i = 0; i < cantidad; i++) {
			String articulo = JOptionPane.showInputDialog("Que quieres comprar?");
			int precio[] =articulos.get(articulo);
			carrocompra.add(precio[0]);
			
		}
		mostrar();
	}
	
	public static double IVA(int articulo, String seleccion) {
		double precioIVA = 0;
		switch (seleccion) {
		case "4%":
			precioIVA = articulo + (articulo * 0.04);
			break;
		case "21%":
			precioIVA = articulo + (articulo * 0.21);
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
			
			System.out.println("Articulo " + (i + 1) + "  con precio bruto de " + carrocompra.get(i)+" y su precio con IVA " + IVA(carrocompra.get(i), EscribirIVA));
		}
		System.out.println("Numero de articulos comprados: " + carrocompra.size());
		cobrar();
	}

	public static void cobrar() {
		int total = 0;
		for (int i = 0; i < carrocompra.size(); i++) {
			total = total + carrocompra.get(i);
		}
		System.out.println("Tienes que pagar: " + total);
		int pagar = Integer.parseInt(JOptionPane.showInputDialog("Cantidad pagada"));
		System.out.println("El cambio al cliente: " + (pagar - total));
	}

}