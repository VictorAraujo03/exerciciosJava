// 17) b[0] deve receber o índice (posição) do menor elemento (conteúdo) de a. Em caso de empate, o índice indicado deve ser o menor.
// Resposta: 6
// (Note que a[6] = 10 é o menor elemento (conteúdo) presente no vetor a.)
// Variante: modifique o programa para que, em caso de empate entre dois índices (posições), indique-se o maior índice (posição).
public class ex17 {
    public static void main(String[] args) {
        int[] a = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int[] b = new int[1];
        int menor = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < menor) {
                menor = a[i];
                b[0] = i;
            }
        }
        System.out.println("Menor elemento em A: " + menor);
        System.out.println("Índice do menor elemento em A: " + b[0]);        
    }
}
