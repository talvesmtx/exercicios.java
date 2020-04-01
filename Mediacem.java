import java.util.Scanner;

public class Mediacem {

public static void main(String[] args) {
	int numero;
	int cont = 0;
	
	Scanner in = new Scanner(System.in);

	do {
		System.out.println("Entre com um número positivo, um numero negativo encerra a digitação:");
		numero = in.nextInt();
		cont++;
	} while (numero >= 0);

	in.close();
	
	int media = numero/cont;
	System.out.println("\nA média dos numero digitados é de: "+ media + "\nForam digitados " + cont + " números." );

}
}