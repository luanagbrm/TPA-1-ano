import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		
		int num;
		System.out.println("Digite o número que deseja descobrir o fatorial");
		num=in.nextInt(); 
		
		int cont=num;
		int soma=1;
		
		do {
		soma=soma*cont;
		cont--;
		}
		
		while(cont<=num && cont>1);
		
		
		System.out.println("O fatorial de " +num+ " é " +soma);
	}

}
