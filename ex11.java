//Exercicio 09 e 10 só que utilizando for ao invés de 'while' e 'do-while'.

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        for (int i = 1; i < 50; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            total += numero;
        }
        scanner.close();

        double media = (double) total / 50;
        System.out.println("A média aritmética dos 50 números digitados é: " + media);
    }
}
