// 20) b deve receber a lista dos índices (posições) de a que contém elementos maiores do que 50.
// Resposta: 2 3 7 12 13 15 17 18
public class ex20 {
    public static void main(String[] args) {
        int[] a = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int[] b = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 50) {
                b[j] = i;
                System.out.print(b[j] + " ");
                j++;
            }
        }
    }
}
