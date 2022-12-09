import java.util.Scanner;
public class CondicionalTernario {

	public static void main(String[] args) {
		/*int a;
		String b;
		a = 12;
		b = (a == 5) ? "a e igual a 5": "a e diferente de 5";
		System.out.println("Resultado : " + b);
		
		b = (a == 12) ? "a e igual a 12": "a e diferente de 12";
		System.out.println("Resultado : " + b);*/
		
		Scanner horario = new Scanner (System.in);
		double str = 14;
		String stre;
		System.out.println("Digite o horario de chegada: ");
		str = horario.nextDouble();
		
		stre = (str > 14)? "Atrasado": (str < 14)? "Adiantado" : "No horario" ;
		System.out.println( "Resultado : " + stre);
		
	}

}
