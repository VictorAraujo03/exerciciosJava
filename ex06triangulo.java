//  Faça um programa que receba 3 valores que representarão os lados de um triângulo e verifique se os valores formam um triângulo e classifique esse triângulo como:
// - eqüilátero (3 lados iguais);
// - isósceles (2 lados iguais);
// - escaleno (3 lados diferentes).
// Lembre-se que para formar um triângulo:
// - nenhum dos lados pode ser igual a zero;
// - um lado não pode ser maior do que a soma dos outros dois;
public class ex06triangulo {
    public static void main(String[] args) {
        int lado1 = 5; // Digite o primeiro lado.
        int lado2 = 3; // Digite o segundo lado.
        int lado3 = 3; // Digite o terceiro lado.
        if (lado1 == 0 || lado2 == 0 || lado3 == 0) {
            System.out.println("Não é um triângulo.");
        } else if (lado1 > lado2 + lado3 || lado2 > lado1 + lado3 || lado3 > lado1 + lado2) {
            System.out.println("Não é um triângulo.");
        } else if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("É um triângulo equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("É um triângulo isósceles.");
        } else {
            System.out.println("É um triângulo escaleno.");
        }                
    }    
}
