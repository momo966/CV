import java.util.Scanner;

public class piusomme {
  public static void main(String[] args) {
    System.out.println("HELLO WORD");
    System.out.println("*----------------*");
    System.out.println("| MAHMOUD BASHA  |");
    System.out.println("*----------------*");


    Scanner input = new Scanner(System.in);

    System.out.println("inserici il 1 val:");
    int lat1 = input.nextInt();
    System.out.println("inserici il 2 val:");
    int lat2 = input.nextInt();


    int somma1 = lat1 + lat2;
    int sotra1 = lat1 - lat2;
    int molt1 = lat1 * lat2;
    float div1 = lat1 / lat2;

    System.out.println("somma è:" + somma1 );
    System.out.println("sotrazione è:" + sotra1 );
    System.out.println("moltiplicazione è:" + molt1 );
    System.out.println("divizione è:" + div1 );
  }
}
