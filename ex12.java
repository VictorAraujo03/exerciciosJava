// Faça um programa que receba 10 valores inteiros e os coloque em um vetor. Em seguida exiba-os em ordem inversa à ordem de entrada.
public class ex12 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int i = 0;
        while (i < 10) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = Integer.parseInt(System.console().readLine());
            i++;
        }
        System.out.println("Os números digitados em ordem inversa são:");
        for (int j = 9; j >= 0; j--) {
            System.out.println(numeros[j]);
        }
    }
}
