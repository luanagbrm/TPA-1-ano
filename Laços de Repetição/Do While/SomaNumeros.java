import java.util.Scanner;

public class SomaNumeros {

	public static void main (String [ ] args) {
	Scanner in=new Scanner (System.in);
	
	int conter=1;
	double soma=0,n; 
	
	do{
	System.out.println ("Digite o valor do número"+ conter + ":");
	n= in.nextDouble ( );
	soma=n+soma;
	conter++; 
	}
	 while(conter<=5);
	System.out.println ("resultado é" + soma); 
	}
	}

