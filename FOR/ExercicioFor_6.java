import java.util.Scanner;

public class ExercicioFor_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0;
        int nulos = 0, brancos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Eleitor nº " + i);
            System.out.print("Digite o código do seu voto (1 a 6): ");
            int voto = entrada.nextInt();

            switch (voto) {
                case 1: cand1++; break;
                case 2: cand2++; break;
                case 3: cand3++; break;
                case 4: cand4++; break;
                case 5: nulos++; break;
                case 6: brancos++; break;
                default:
                    System.out.println("Voto inválido! (Não será computado)");
                    break;
            }
        }

        double percNulos = (nulos / 10.0) * 100;
        double percBrancos = (brancos / 10.0) * 100;

        System.out.println("\n--- RESULTADO DA ELEIÇÃO ---");
        System.out.println("Candidato 1: " + cand1 + " votos");
        System.out.println("Candidato 2: " + cand2 + " votos");
        System.out.println("Candidato 3: " + cand3 + " votos");
        System.out.println("Candidato 4: " + cand4 + " votos");
        System.out.println("Total de votos nulos: " + nulos);
        System.out.println("Total de votos em branco: " + brancos);
        System.out.println("Percentual de Nulos: " + percNulos + "%");
        System.out.println("Percentual de Brancos: " + percBrancos + "%");

        entrada.close();
    }
}