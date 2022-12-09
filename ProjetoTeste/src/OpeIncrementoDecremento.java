
public class OpeIncrementoDecremento {

	public static void main(String[] args) {
		int num = 10;
		int result = 0;
		
		System.out.println("Valor original: " + result);
		result = num++; // Primeiro atribuir, depois incrementar
		System.out.println("Valor de num apos o incremento: " + num);
		System.out.println("Valor de result apos o incremento: " + result);
		
		num =10; result = 0;
		
		result = ++num; // Primeiro incrementa, depois atribui
		System.out.println("Valor de num apos o incremento: " + num);
		System.out.println("Valor de result apos o incremento: " + result);
		
		//TERMINAL:
		//Valor original: 0
		//Valor de num apos o incremento: 11
		//Valor de result apos o incremento: 10
		//Valor de num apos o incremento: 11
		//Valor de result apos o incremento: 11

	}

}
