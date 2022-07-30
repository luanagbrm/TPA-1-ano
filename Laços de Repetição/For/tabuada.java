import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int num=0;
		System.out.println("Digite um número inteiro");
		num=in.nextInt();
		
		for(int resultado=1, cont=1; cont<=10; cont++) {
		resultado=cont*num;
		System.out.println(num+ "x" +cont+ "=" +resultado);
		}

	}

}
