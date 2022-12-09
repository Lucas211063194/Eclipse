import java.util.Scanner;
public class CondicionalIfElse {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double livroLinux;
		double livroJava;
		System.out.println("Entre com o valor do livro Linux:");
		livroLinux = entrada.nextDouble();
		System.out.println("Entre com o valor do livro Java:");
		livroJava = entrada.nextDouble();
		
		double total = livroLinux + livroJava;
		System.out.println("O valor total: " + total);
		
		if (livroLinux == 10) {
			System.out.println("O livro de linux esta muito barato!\n");
		}
		if (total <= 120.00) {
			System.out.println("O valor esta bom!");
		}
		else {
			System.out.println("Os livros estao caros!");
		}
		if (livroLinux > livroJava) {
			System.out.println("O livro Java esta mais barato!");
		}
		else if (livroLinux < livroJava) {
			System.out.println("O livro Linux esta mais barato!");
		}
		else {
			System.out.println("O valor e o mesmo!");
		}
		
	}

}

