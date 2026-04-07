import java.util.Scanner;

public class ExercicioFor_4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double somaAlturas = 0; 
        
        int contaPessoas = 0;   
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + ":");
            
            System.out.print("Digite a idade: ");
            int idade = leitor.nextInt();
            
            System.out.print("Digite a altura (ex: 1,75): ");
            double altura = leitor.nextDouble();
            

            if (idade > 50) {
                somaAlturas = somaAlturas + altura;
                contaPessoas++;
            }
        }
        
        if (contaPessoas > 0) {
            double media = somaAlturas / contaPessoas;
            System.out.println("A média das alturas de pessoas com mais de 50 anos é: " + media);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi cadastrada.");
        }
        
        leitor.close();
    }
}

