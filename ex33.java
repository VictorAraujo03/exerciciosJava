// 33) b deve receber a ordenado de forma crescente ou “ ordem não-decrescente”, já que poderá haver números repetidos. 
// Este é um problema de solução mais complicada, para a qual haverá soluções clássicas, que veremos nesta disciplina. 
// Veja o que consegue sozinho!
// Resposta: 10 11 12 13 15 16 19 32 35 35 38 45 54 64 65 66 81 89 89 96
public class ex33 {
    public static void main(String[] args) {
        int[] numeros = {38, 12, 65, 13, 35, 19, 11, 54, 10, 89, 16, 96, 35, 81, 66, 45, 32, 89, 64};

        // Chame o método de ordenação de seleção
        ordenacaoSelecao(numeros);

        // Exiba o array ordenado
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }

    public static void ordenacaoSelecao(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            // Troque o elemento atual pelo elemento mínimo encontrado
            int temp = arr[i];
            arr[i] = arr[indiceMinimo];
            arr[indiceMinimo] = temp;
        }
    }
}
