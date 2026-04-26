import java.util.Scanner;
public class ExercicioFor_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int reprovado = 0;
        int exame = 0;
        int aprovado = 0;

        double somaMediaClasse = 0;

        for (int i = 1; i <= 6; i++){
            System.out.println("----- Aluno " + i + " -----");
            
            System.out.println("Digite a primeira nota: ");
            double nota1 = entrada.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double nota2 = entrada.nextDouble();

            double somaMediaAluno = (nota1 + nota2) / 2;
            System.out.println("A média do aluno é: " + somaMediaAluno);

            if (somaMediaAluno >= 7) {
                System.out.println("APROVADO");
                aprovado++;
            } else if (somaMediaAluno >3 && somaMediaAluno <7){
                System.out.println("EXAME");
                exame++;
            } else {
                System.out.println("REPROVADO");
                reprovado++;
            }

            somaMediaClasse += somaMediaAluno;
            System.out.println();
        }

        double mediaClase = somaMediaClasse / 6;

        System.out.println( "===== RESULTADO FINAL =====");
        System.out.println("Total de aprovados: " +aprovado);
        System.out.println("Total de aluno que precisam fazer exame: " +exame);
        System.out.println("Total de reprovados: " +reprovado);
        System.out.println("media da classe: " +mediaClase);

        entrada.close();
    }

}
