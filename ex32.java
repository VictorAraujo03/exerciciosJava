// 32) b deve receber a lista dos elementos de a que são primos.
// Resposta: 89 13 11 89 19
public class ex32 {
    public static void main(String[] args) {
        int[] a = {32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19};
        int[] b = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                b[j] = a[i];
                System.out.print(b[j] + " ");
                j++;
            }
        }
        
    }
    public static boolean isPrime(int n) {
        if (n == 1) return false;
        if (n == 2) return true;
        for (int i = 2; i < n; i++)
            if (n % i == 0) return false;
        return true;
    }
}
