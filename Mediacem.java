import java.util.Scanner;

public class Mediacem {

public static void main(String[] args) {
	int numero;
	int cont = 0;
	
	Scanner in = new Scanner(System.in);

	do {
		System.out.println("Entre com um n�mero positivo, um numero negativo encerra a digita��o:");
		numero = in.nextInt();
		cont++;
	} while (numero >= 0);

	in.close();
	
	int media = numero/cont;
	System.out.println("\nA m�dia dos numero digitados � de: "+ media + "\nForam digitados " + cont + " n�meros." );

}
}