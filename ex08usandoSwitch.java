// Mesmo exercicio da ex07 porém usando Switch Case agora.
import java.util.Scanner;

public class ex08usandoSwitch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o código da ferramenta: ");
            int codigo = scanner.nextInt();
            switch (codigo) {
                case 1:
                    System.out.println("Parafuso");
                    break;
                case 2:
                    System.out.println("Porca");
                    break;
                case 3:
                    System.out.println("Prego");
                    break;
                default:
                    System.out.println("Diversos");
                    break;
            }
        }
    }
    
}
