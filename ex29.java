// 29) b deve receber a lista dos índices de a que contém 
// o mesmo elemento que está no índice "simétrico": O primeiro elemento deve ser comparado com o último, o segundo com o penúltimo e assim por diante. Um par de números só deve ser comparado uma vez, ou seja, se a[3] = a[16] apenas o 3 deve aparecer na lista.
// Resposta: 2 5
public class ex29 {
    public static void main(String[] args) {
        int[] a = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int[] b = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] == a[a.length - 1 - i]) {
                b[j] = i;
                System.out.print(b[j] + " ");
                j++;
            }
        }

    }
}
