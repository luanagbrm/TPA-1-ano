import java.util.Scanner;

public class media10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double nindiv = 0;
		double[] media = new double [11];

		for (int cont=1; cont<=10; cont++) {
			System.out.println("Digite a primeira nota da " +cont+ "� pessoa" );
			media[cont]=in.nextDouble();
			
			System.out.println("Digite a segunda nota da " +cont+ "� pessoa");
			nindiv=in.nextDouble();
			
			media[cont]=(media[cont]+nindiv)/2;
		}
		
		for(int cont=1; cont<=10; cont++) {
			System.out.println("A m�dia da " +cont+ "� pessoa � "+media[cont]);
			
		}
	}

}
