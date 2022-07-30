import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		
		int n, mod;
		System.out.println("Digite um número inteiro, e descubra se ele é par ou ímpar!");
		n=in.nextInt();
		
		mod=n%2;
		
		if (mod==0)
		{System.out.println("O número digitado é par");
			
		}else {System.out.println("O número digitado é ímpar");}
		

	}

}
