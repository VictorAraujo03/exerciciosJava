// 23) b[0] deve receber o maior elemento de A que seja inferior a 50 (se não houver números inferiores a 50, a resposta deve ser 0). Considere que nunca haverá elementos negativos em a.
// Resposta: 45
public class ex23 {
    public static void main(String[] args) {
        int[] a = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int[] b = new int[1];
        int maior = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 50 && a[i] > maior)
                maior = a[i];
        }
        b[0] = maior;
        System.out.println(b[0]);
    }
}
