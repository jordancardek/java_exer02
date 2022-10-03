import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //Requisito 1 digitar um numero
         System.out.println("Digite um numero: ");
         double num = scan.nextDouble();
         scan.close();
         // Requisito numero 2 mostrar mensagem
         System.out.println("Voce digtou o numero: " + num);
    }
}
