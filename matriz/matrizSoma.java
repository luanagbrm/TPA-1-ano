
public class matrizSoma {

	public static void main(String[] args) {
		
		int soma=0;
		int[][] matriz = {
		{1,2,3,4},
		{2,4,6,8},
		{3,6,9,12},
		{4,8,12,16}
		};
		
		for(int cont=0; cont<=3; cont++) {
			for (int contII=0; contII<=3; contII++) {
				soma+= matriz[cont][contII];
			}
		}
		
		System.out.println("O resultado da soma dos elementos da matriz é " +soma);
	}

}
