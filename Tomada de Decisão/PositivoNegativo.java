import java.util.Scanner;

public class PositivoNegativo {

public static void main(String[] args) {
	Scanner in=new Scanner (System.in);
		
	int n;
		
	System.out.println("Digite um número inteiro, e descubra se ele é positivo ou negativo");
		n=in.nextInt();
		
		if (n<0)
		{System.out.println("O número digitado é negativo");
	
		}else {System.out.println("O número digitado é positivo");}
		
	}

}
