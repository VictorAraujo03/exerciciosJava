// 27) b deve receber a lista dos índices de a em que aparecem elementos menores do que os que estão no índice seguinte. O último índice do vetor não deve ser considerado.
// Resposta: 0 1 4 6 11 12 14 16
public class ex27 {
    public static void main(String[] args) {
        int[] a = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int[] b = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                b[j] = i;
                System.out.print(b[j] + " ");
                j++;
            }
        }
    }
}
