// 28) b deve receber a lista dos índices de a em que aparecem elementos que são a média aritmética dos seus vizinhos à esquerda e à direita. O primeiro e o último índice não devem ser considerados.
// Resposta: 10 18

public class ex28 {
    public static void main(String[] args) {
        int[] a = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int[] b = new int[a.length];
        int j = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] == (a[i - 1] + a[i + 1]) / 2) {
                b[j] = i;
                System.out.print(b[j] + " ");
                j++;
            }
        }
    }    
}
