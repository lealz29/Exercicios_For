import java.util.Scanner;

public class ExercicioFor_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int qtdMais50 = 0;
        double somaAlturas10a20 = 0;
        int contAlturas10a20 = 0;
        int qtdPesoBaixo = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Dados da pessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = teclado.nextInt();
            System.out.print("Altura (ex: 1,70): ");
            double altura = teclado.nextDouble();
            System.out.print("Peso: ");
            double peso = teclado.nextDouble();

            if (idade > 50) {
                qtdMais50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas10a20 += altura;
                contAlturas10a20++;
            }

            if (peso < 40) {
                qtdPesoBaixo++;
            }
        }

        double mediaAlturas = (contAlturas10a20 > 0) ? somaAlturas10a20 / contAlturas10a20 : 0;
        double porcentagemPeso = (qtdPesoBaixo * 100.0) / 10;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Pessoas com mais de 50 anos: " + qtdMais50);
        System.out.println("Média das alturas (10-20 anos): " + String.format("%.2f", mediaAlturas) + "m");
        System.out.println("Porcentagem de pessoas com menos de 40kg: " + porcentagemPeso + "%");

        teclado.close();
    }
}