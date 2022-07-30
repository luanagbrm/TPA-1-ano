import java.util.Scanner;

public class Aposentadoria {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		
		int anoNasc, idade, anosRestfem, anosRestmasc;
		String sexo;
		
		System.out.println("Digite seu ano de nascimento");
		anoNasc=in.nextInt();
		
		System.out.println("Digite seu sexo");
		sexo=in.next();
		
		idade=2021-anoNasc;
		
		anosRestfem=60-idade;
		anosRestmasc=65-idade;
		 
		if (idade>=60 && sexo.equalsIgnoreCase("feminino"))
		{System.out.println("Você já tem direito a aposentadoria");}
		
		else if (idade<60 && sexo.equalsIgnoreCase("feminino"))
		{System.out.println("Faltam " +anosRestfem+ " anos para a sua aposentadoria");
		}
		
		else if (idade>=65 && sexo.equalsIgnoreCase("masculino"))
		{System.out.println("Você já tem direito a aposentadoria");}
		
		else 
		{System.out.println("Faltam " +anosRestmasc+ " anos para a sua aposentadoria");
		}
		
	}

}
