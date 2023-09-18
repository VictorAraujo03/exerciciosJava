// 26) b deve receber a lista decrescente dos índices de a que contenham elementos menores que 50.
// Resposta: 19 16 14 11 10 9 8 6 5 4 1 0
public class ex26 {
    public static void main(String[] args) {
        int[] a = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int[] b = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] < 50) {
                b[j] = i;
                System.out.print(b[j] + " ");
                j++;
            }
        }
    }
}
