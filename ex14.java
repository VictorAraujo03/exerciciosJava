// A Resposta apresentada a partir deste exercício considera a entrada do vetor a como no programa exemplo :
// 32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19  
// 14) O vetor b deve se tornar uma cópia do vetor a.
// Resposta: 32 45 89 66 12 35 10 96 38 15 13 11 65 81 35 64 16 89 54 19
public class ex14 {
    public static void main(String[] args) {
        int[] a = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            System.out.print(b[i] + " ");
        }
    }
}
