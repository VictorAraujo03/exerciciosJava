// 34) b deve receber os elementos de a, removendo-se os que aparecem apenas uma vez. Os que aparecem mais de uma vez devem aparecer tantas vezes quantas apareciam em a.
// Resposta: 89 35 35 89
public class ex34 {
    public static void main(String[] args) {
        int[] a = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int[] b = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (count(a, a[i]) > 1) {
                b[j] = a[i];
                System.out.print(b[j] + " ");
                j++;
            }
        }
    }
    public static int count(int[] a, int n) {
        int c = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] == n) c++;
        return c;
    }
}
