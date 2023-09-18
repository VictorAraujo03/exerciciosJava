//01 - Faça um programa que receba um valor que é o valor pago, um segundo valor que é o preço do produto e retorne o troco a ser dado.

import java.util.Scanner;

public class ex01 {
    public static void main (String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o valor do produto: ");
            double valorProduto = scan.nextDouble();
            System.out.println("Digite o valor pago: ");
            double valorPago = scan.nextDouble();
            double troco = valorPago - valorProduto;
            System.out.println("O seu troco é: " + troco);
        }
    }
}