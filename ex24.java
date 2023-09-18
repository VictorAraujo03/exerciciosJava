// 24) b[0] deve receber o índice do primeiro elemento ímpar de a (se não houver números ímpares em a, a resposta deve ser n).
// Resposta: 1
public class ex24 {
    public static void main(String[] args) {
        int[] a = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int[] b = new int[1];
        int indice = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                indice = i;
                break;
            }
        }
        b[0] = indice;
        System.out.println(b[0]);
    }
}
