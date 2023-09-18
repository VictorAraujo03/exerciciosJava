// 31) b[0] deve receber o maior elemento de a, enquanto que b[1] deve receber o segundo maior elemento de a. Você pode supor que a tem pelo menos dois elementos.
// Resposta: 96 89
// OBS: os próximos exercícios podem exigir dois laços, além de comandos condicionais.
public class ex31 {
    public static void main(String[] args) {
        int[] a = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int[] b = new int[2];
        int maior = 0;
        int segundoMaior = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maior)
                maior = a[i];
        }
        b[0] = maior;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > segundoMaior && a[i] < maior)
                segundoMaior = a[i];
        }
        b[1] = segundoMaior;
        System.out.println(b[0] + " " + b[1]);
    }
}
