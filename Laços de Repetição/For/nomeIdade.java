import java.util.Scanner;

public class nomeIdade {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int[] idade= new int[11];
		String[] nome= new String[11];
		String velhonome="";
		int idadevelho=0;
		String novonome="";
		int idadenovo=0;
		
		for(int cont=1; cont<=10; cont++) {
			
			System.out.println("Digite seu nome");
				nome[cont]=in.next();
			
			System.out.println("Digite sua idade");
				idade[cont]=in.nextInt();
				
				idadenovo=idade[cont];
				idadevelho=idade[cont];
				velhonome=nome[cont];
				novonome=nome[cont];
		}
		for(int cont=1; cont<=10; cont++) {
				
		if(idade[cont]<idadenovo) {
			idadenovo=idade[cont];
			novonome=nome[cont];
		}
		
		
		else if (idade[cont]>idadevelho){
			idadevelho=idade[cont];
			velhonome=nome[cont];
		}
		
		}
		System.out.println("O nome do usuário mais novo é " +novonome+ " com " +idadenovo+ " anos de idade");
		System.out.println("O nome do usuário mais velho é " +velhonome+ " com " +idadevelho+ " anos de idade");
		}
	}

