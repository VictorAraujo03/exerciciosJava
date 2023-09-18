// 09)  Faça um programa que utilize a estrutura while para ler 50 números e calcule e exiba a média aritmética deles.
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int total = 0;
            int contador = 0;

            while (contador < 50) {
                System.out.print("Digite o " + (contador + 1) + "º número: ");
                int numero = scanner.nextInt();
                total += numero;
                contador++;
            }
            double media = (double) total / 50;
            System.out.println("A média aritmética dos 50 números digitados é: " + media);
        }
    }
}
