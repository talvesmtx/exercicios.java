public class Pares {

    public static void main(String[] args) {
        int [] array = new int[100];
        int contador = 0;        
        int numeroPar = 0;
        while(contador < array.length){
            array[contador] = numeroPar;
            System.out.println(array[contador]);
            contador++;
            numeroPar += 2;
        }
    }
}