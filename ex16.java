// 16) b[0] deve receber o valor do maior elemento (conteúdo) de a.
// Resposta: 96
public class ex16 {
    public static void main(String[] args) {
        int[] a = {15,30, 22, 96, 31, 5};	
        int[] b = new int[1]; //Vetor b com tamanho 1

        int maior = a[0]; //Variável maior recebe o primeiro elemento do vetor a

        for (int i = 1; i < a.length; i++) { //Percorre o vetor a
            if (a[i] > maior) {
                maior = a[i]; //Se o elemento atual for maior que o maior, o maior recebe o elemento atual
            }
        }
        b[0] = maior; //Vetor b recebe o maior elemento
        
        System.out.println("Maior elemento em A: " + maior); //Imprime o maior elemento
        System.out.println("Valor em b[0]: " + b[0]); //Imprime o primeiro elemento do vetor b
    }
}
