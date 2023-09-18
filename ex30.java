// 30) b deve receber a “ filtrado”. O primeiro e o último índice se mantém iguais, mas os índices internos devem ser modificados da seguinte maneira: cada índice de b conterá a média aritmética
//  do número na posição correspondente em b e dos números vizinhos.
// Resposta: 32 55 66 55 37 19 47 48 49 22 13 29 52 60 60 38 56 53 54 19
public class ex30 {
    public static void main(String[] args) {
        int[] a = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i == 0 || i == a.length - 1) {
                b[i] = a[i];
            } else {
                b[i] = (a[i - 1] + a[i] + a[i + 1]) / 3;
            }
            System.out.print(b[i] + " ");
        }
    }
}
