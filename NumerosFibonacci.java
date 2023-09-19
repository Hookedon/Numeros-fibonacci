package numeros;

public class NumerosFibonacci {

	public static void main(String[] args) {
		
		int numero1=0;
		int numero2=1;
		int auxiliar=0;
		
		for(int i=0; i<27;i++) {
			auxiliar=numero1+numero2;
			System.out.println(auxiliar);
			numero1=numero2;
			numero2=auxiliar;
		}

	}

}
