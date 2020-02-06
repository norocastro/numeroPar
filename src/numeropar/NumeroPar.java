package numeropar;
import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {
        int numero;
        Scanner n = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        numero = n.nextInt();
        
        if (numero%2 == 0){
            System.out.println(numero+" es par.");
        } else {
            System.out.println(numero+" es impar.");
        }
    }
    
}
