import java.util.ArrayList;

public class Ejercicio1 {

	
	public static void main(String[] args) {
		
		notas();

	}
	
	public static void notas(){
		int sumatotalnotas = 0;
		int contador = 1;
		
		ArrayList<Integer> notas = new ArrayList<Integer>();
		notas.add(10);
		notas.add(8);
		notas.add(6);
		notas.add(4);
		notas.add(2);
		
		
		for(int i=0; i<notas.size(); i++) {
			int mostrarnotas = notas.get(i);
			System.out.println("nota nº"+(contador++)+": "+mostrarnotas);
			
			sumatotalnotas = sumatotalnotas + mostrarnotas;
			
			
			
		}
		 
		System.out.println("");
		System.out.println("la media de las notas es = "+(sumatotalnotas/5));
		
		
		
		
	}

}
