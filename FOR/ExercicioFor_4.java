import java.util.Scanner;

public class ExercicioFor_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double somaAltura = 0; 
        
        int QuantPessoas = 0;   
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + ":");
            
            System.out.print("Digite a idade: ");
            int idade = entrada.nextInt();
            
            System.out.print("Digite a altura (ex: 1,75): ");
            double altura = entrada.nextDouble();
            

            if (idade > 50) {
                somaAltura = somaAltura + altura;
                QuantPessoas++;
            }
        }
        
        if (QuantPessoas > 0) {
            double media = somaAltura / QuantPessoas;
            System.out.println("A média das alturas de pessoas com mais de 50 anos é: " + media);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi cadastrada.");
        }
        
        entrada.close();
    }
}
