import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int rand = random.nextInt(100);

        System.out.println("""
                                Bem vindo ao Jogo de Adivinhação!

                    Como Funciona: a máquina ira sortear um numero de 0 a 100, seu
                objetivo é conseguir adivinhar qual é este número em até 8 tentativas.
                    Cada vez que você realizar uma tentativa aparecerá as seguintes
                informaçõens: se o numero chutado é menor ou maior que o número da
                máquina e se esta quente ou frio, sendo quente uma proximidade >= 10.

                            """);
        int tentativas = 0;
            
        while (tentativas < 8) {
            
            System.out.println("Digite um numero:");
            int num = scan.nextInt();
            tentativas++;            
            if (num != rand) {
                if (num < rand) {
                    System.out.println("Esse número é menor que o da máquina");
                    System.out.println((rand - 10) <= num ? "Quente" : "Frio");
                } else if (num > rand) {
                    System.out.println("Esse número é maior que o da máquina");
                    System.out.println((rand + 10) >= num ? "Quente" : "Frio");
                }
            } else {
                System.out.println("\nPARABÉNS você venceu em " + tentativas + " tentativas!");
                break;
            }
            System.out.println("\nTentativas feitas: " + tentativas);
            System.out.println("---------------------------");
        }
        if (tentativas == 8) {
            System.out.println("QUE PENA! Você gastou todas as suas tentativas :(");
            System.out.println("O número era: " + rand);
        }

    }
}