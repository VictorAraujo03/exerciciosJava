//Faça um programa que receba 4 valores e retorne o menor entre eles.
public class ex04 {
    public static void main(String[] args) {
        int valor1 = 67; // Digite o primeiro valor.
        int valor2 = 66; // Digite o segundo valor.
        int valor3 = 68; // Digite o terceiro valor.
        int valor4 = 65; // Digite o quarto valor.
        if (valor1 < valor2 && valor1 < valor3 && valor1 < valor4) {
            System.out.println("O menor valor é: " + valor1);
        } else 
        if (valor2 < valor1 && valor2 < valor3 && valor2 < valor4) {
            System.out.println("O menor valor é: " + valor2);
        } else 
        if (valor3 < valor1 && valor3 < valor2 && valor3 < valor4) {
            System.out.println("O menor valor é: " + valor3);
        } else 
        if (valor4 < valor1 && valor4 < valor2 && valor4 < valor3) {
            System.out.println("O menor valor é: " + valor4);
        }
    }
}