import java.util.Scanner;

public class somma2 {
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

    System.out.println("somma è:" + somma1 );
  }
}
