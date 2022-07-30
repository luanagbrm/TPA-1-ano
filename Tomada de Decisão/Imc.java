import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		
		double imc,p,a;
		
		System.out.println("Digite seu peso em kg");
		p=in.nextDouble();
		
		System.out.println("Digite sua altura em metros");
		a=in.nextDouble();
		
		imc=p/(a*a);
		
		if (imc<18.5)
		{System.out.println("Seu IMC é " +imc+ " e você possui extrema magreza");
			
		}else if (imc>=18.5 && imc<=25)
		{System.out.println("Seu IMC é " +imc+ " e você está no peso normal");
		
		}else if (imc>25 && imc<=30)
		{System.out.println("Seu IMC é " +imc+ " e você possui excesso de peso");
		
	
		}else if (imc>=30 && imc<=35)
		{System.out.println("Seu IMC é " +imc+ " e você possui obessidade grau I");
			
		}else if (imc>=35 && imc<=40)
		{System.out.println("Seu IMC é " +imc+ " e você possui obessidade grau II");
		
		}else
		{System.out.println("Seu IMC é " +imc+ "e você possui obesidade grau III");
		}
	}

}
