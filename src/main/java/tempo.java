import java.util.Scanner;

public class tempo
{
  public static void main(String[] args) {
    System.out.println("HELLO WORD");
    System.out.println("*----------------*");
    System.out.println("| MAHMOUD BASHA  |");
    System.out.println("*----------------*");


    Scanner input = new Scanner(System.in);


    int giorno= input.nextInt();
    int ore= input.nextInt();
    int minuti= input.nextInt();
    int secondi= input.nextInt();

    int ds=giorno*86400;
    int hs=ore*3600;
    int ms=minuti*60;
    int s=secondi;

    System.out.println ("SOMMA:"+ (ds+hs+ms+secondi));

  }
}
