import java.util.Scanner;

public class PositivoNegativo {

public static void main(String[] args) {
	Scanner in=new Scanner (System.in);
		
	int n;
		
	System.out.println("Digite um n�mero inteiro, e descubra se ele � positivo ou negativo");
		n=in.nextInt();
		
		if (n<0)
		{System.out.println("O n�mero digitado � negativo");
	
		}else {System.out.println("O n�mero digitado � positivo");}
		
	}

}
