import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		
		int n, mod;
		System.out.println("Digite um n�mero inteiro, e descubra se ele � par ou �mpar!");
		n=in.nextInt();
		
		mod=n%2;
		
		if (mod==0)
		{System.out.println("O n�mero digitado � par");
			
		}else {System.out.println("O n�mero digitado � �mpar");}
		

	}

}
