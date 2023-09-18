//Mesmo exercicio da 09, só que usando do-while ao invés de while.

import java.util.Scanner;

public class ex10usandoDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int contador = 0;

        do {
            contador++;
            System.out.print("Digite o " + contador + "º número: ");
            int numero = scanner.nextInt();
            total += numero;
        } while (contador < 50);

        scanner.close();

        double media = (double) total / 50;
        System.out.println("A média aritmética dos 50 números digitados é: " + media);
    }
}
