import java.util.Arrays;
import java.util.Scanner;

public class matriz3x3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int[][] matriz = new int [3][3];
		
		
		for(int cont=0; cont<=2; cont++) {
			for (int contII=0; contII<=2; contII++) {
				System.out.println("Informe o valor para a coordenada [" +cont+ ", " +contII+"]:");
				matriz[cont][contII]=in.nextInt();
			}
		}
		
		for(int[] row : matriz) {
			System.out.println(Arrays.toString(row));
		}
		
			}
		}