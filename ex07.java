// 07) Utilize a estrutura if para fazer um programa que retorne o nome de um produto a partir do código do mesmo. Considere os seguintes códigos:
// 1 – Parafuso;
// 2 – Porca;
// 3 – Prego;
// Para qualquer outro código indicar “Diversos”
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o código da ferramenta: ");
            int codigo = scanner.nextInt();
            
            if (codigo == 1){
                System.out.println("Parafuso");
            } else if (codigo == 2){
                System.out.println("Porca");
            } else if (codigo == 3){
                System.out.println("Prego");
            } else {
                System.out.println("Diversos");
            }
        }
    }
}
