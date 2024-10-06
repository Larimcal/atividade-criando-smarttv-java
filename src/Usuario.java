import java.sql.SQLOutput;
import java.util.Scanner;

public class Usuario {
    public static void main (String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();
        Scanner scanner = new Scanner(System.in);

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("A TV está em qual canal? " + smartTv.canal);
        System.out.println("A TV está em qual volume? " + smartTv.volume);

        // Ligar e desligar a TV
        smartTv.ligar();
        System.out.println("Novo Status -> A TV está ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status -> A TV está ligada? " + smartTv.ligada);

        // Aumentar e diminuir o volume
        smartTv.aumentarVolume();
        System.out.println("Novo Status -> A TV está em qual volume? " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo Status -> A TV está em qual volume? " + smartTv.volume);

        // Avançar e dimunuir o canal
        smartTv.aumentarCanal();
        System.out.println("Novo Status -> A TV está em qual canal? " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Novo Status -> A TV está em qual canal? " + smartTv.canal);

        // Mudar o canal
        System.out.println("Digite o canal: ");
        smartTv.mudarCanal( scanner.nextInt());
        System.out.println("A TV está em qual canal? " + smartTv.canal);
        }

}
