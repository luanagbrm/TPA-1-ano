import java.util.Scanner;

public class SomaPausada {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		
		int soma=0, num, cont=0;
		String decisao="";
		
		do {
			System.out.println("Digite um n�mero inteiro");
			num=in.nextInt();
			soma=soma+num;
			System.out.println("Deseja continuar? Digite S para SIM ou N para N�O");
			decisao=in.next();
			
			if (decisao.equalsIgnoreCase("N")) {
			System.out.println("A soma dos n�meros informados � " +soma);
			continue;
			
			
			}else {
				cont++;
			}
			
		} while (decisao.equalsIgnoreCase("S"));
	}

}
