import java.util.Scanner;

public class Inteiro20 {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		
		int n;
		System.out.println("Digite um número inteiro, e descubra se ele é maior que 20!");
		
		n=in.nextInt();
		
		if(n>20) 
		{System.out.println(+n);}
	}

}
