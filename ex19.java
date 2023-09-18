// 19) b deve receber a lista dos números pares de a.
// Resposta: 32 66 12 10 96 38 64 16 54
public class ex19 {
    public static void main(String[] args) {
        int[] a = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int[] b = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[j] = a[i];
                System.out.print(b[j] + " ");
                j++;
            }
        }
    }
}
