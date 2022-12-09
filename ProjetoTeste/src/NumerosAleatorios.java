
import java.util.Random;
public class NumerosAleatorios {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		float valor = aleatorio.nextFloat()*100;
		System.out.println("Numero Gerado: "+ valor);
	}

}
