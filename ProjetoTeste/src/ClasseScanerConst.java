import java.util.Scanner;
public class ClasseScanerConst {
	private static final double LARGURA = 10.0;

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o comprimento:");
		double compr = entrada.nextDouble();
		
		double area = calculArea(LARGURA, compr);
		System.out.println("A area e:" + area);
	}
	private static double calculArea(double largura, double comprimento) {
		return largura * comprimento;
	}
}




