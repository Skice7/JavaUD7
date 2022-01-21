
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static Hashtable<String, int[]> articulos = new Hashtable<String, int[]>();

	public static void main(String[] args) {

		menu();

	}

	public static void menu() {

		String seleccion = "";
		do {

			String seleccionar = JOptionPane.showInputDialog("Escribe una opción \n Opcion1: añadir \n Opción2: mostrar \n Opción3: finalizar ");
			switch (seleccionar) {
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
		
		int array[] = new int[2] ; 
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
			
		}System.out.println("");

	}

}
