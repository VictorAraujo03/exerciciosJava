// Faça um programa que utilize uma estrutura de repetição para ler 50 números armazenando-os em um vetor e calcule e exiba a média aritmética deles. 
// Em seguida o programa deve apresentar todos os valores armazenados no vetor que sejam menores que a média.
import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int tamanhoVetor = 50;
            int[] numeros = new int[tamanhoVetor];
            double soma = 0;

            // Lê os 50 números e os armazena no vetor
            for (int i = 0; i < tamanhoVetor; i++) {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                numeros[i] = input.nextInt();
                soma += numeros[i];
            }

            // Calcula a média aritmética
            double media = soma / tamanhoVetor;

            System.out.println("A média aritmética dos números digitados é: " + media);

            // Exibe os valores menores que a média
            System.out.println("Valores menores que a média:");
            for (int i = 0; i < tamanhoVetor; i++) {
                if (numeros[i] < media) {
                    System.out.println(numeros[i]);
                }
            }
        }
    }
}
