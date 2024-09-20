import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int rand = random.nextInt(100);
        int tentativas = 0;
        while (tentativas < 6) {
            System.out.println("Digite um numero:");
            int num = scan.nextInt();
            tentativas++;
            System.out.println(tentativas);
            if (num != rand) {
                if (num < rand) {
                    System.out.println("Esse numero é menor que " + rand);
                    System.out.println((rand - 10) <= num ? "Quente" : "Frio");
                }else if (num > rand) {
                    System.out.println("Esse numero é menor que " + rand);
                    System.out.println((rand + 10) >= num ? "Quente" : "Frio");
                }
            }else{
                System.out.println("Parabêns você venceu em " + tentativas + " tentativas!");
                break;
            }
        }
        if (tentativas == 6) {
            System.out.println("Você gastou todas as suas tentativas :(");
        }
    }
}