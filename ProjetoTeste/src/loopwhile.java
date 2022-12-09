import java.util.Scanner;
public class loopwhile {

	public static void main(String[] args) {
		/*int contador = -2;
		while (contador <= 50) {
			System.out.println(contador);
			contador++;
		}*/
		Scanner entrada = new Scanner (System.in);
		String nome;
		System.out.println("Digite seu nome ou s para sair:" );
		nome = entrada.nextLine();
		/*!--> É um operador lógico de negação, em resumo
		 enquanto o usuário não digitar "s" o loop continuára.*/
		while (!nome.equals("s")) {
			System.out.printf("Bem Vindo %s\n", nome);
			System.out.println("Digite seu nome ou s para sair:" );
			nome = entrada.nextLine();
		}
		System.out.println("Fim da execucao!");
		
	}

}
