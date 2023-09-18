// 22) b[0] deve receber o total dos elementos ímpares de a.
// Resposta: 497
public class ex22 {
    public static void main(String[] args) {
        int a[] = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int b[] = new int[a.length];
        int soma = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0)
                soma += a[i];
        }
        b[0] = soma;
        System.out.println(b[0]);
    }
}
