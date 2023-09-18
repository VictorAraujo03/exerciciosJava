// 25) b[0] deve receber o índice do último elemento par de a (se não houver números pares em a, a resposta deve ser -1).
// Resposta: 18
public class ex25 {
    public static void main(String[] args) {
        int[] a = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int[] b = new int[1];
        int indice = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                indice = i;
        }
        b[0] = indice;
        System.out.println(b[0]);
    }
}
