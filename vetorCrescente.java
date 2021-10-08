public class vetorCrescente {

	public static void main(String[] args) {
		
		double[] num = new double [10];
		
		num[0]=25;
		num[1]=10;
		num[2]=675;
		num[3]=7;
		num[4]=56;
		num[5]=33;
		num[6]=48;
		num[7]=61;
		num[8]=4;
		num[9]=169;
		
		for(int contI=4; contI<=675; contI++) {
			for (int cont=0; cont<=9; cont++) {
				if(num[cont]==contI) {
					System.out.println(num[cont]);
				}
				
			}
		}
	}

}
