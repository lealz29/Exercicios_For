//Ler um número inteiro e imprimir na tela a sequência de 	números que vai do número 1 até o número lido.
import java.util.Scanner;
public class ExercicioFor_3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite um número: ");
        int num = scanner.nextInt(); 
        

        for (int cont = 0; cont <= num; cont++ ) {
            System.out.print(cont+ " ");
            scanner.close();

        }
    }        

}
