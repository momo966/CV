import java.util.Scanner;

public class triangolo
{
  public static void main(String[] args) {
    System.out.println("HELLO WORD");
    System.out.println("*----------------*");
    System.out.println("| MAHMOUD BASHA  |");
    System.out.println("*----------------*");


    Scanner input = new Scanner(System.in);
    System.out.println("Inserisci base:");
    int base = input.nextInt();
    System.out.println("Inserisci altezza:");
    int altezza = input.nextInt();


    System.out.println("Inserisci lat1:");
    int lat1 = input.nextInt();
    System.out.println("Inserisci lat2:");
    int lat2 = input.nextInt();
    System.out.println("Inserisci lat3:");
    int lat3 = input.nextInt();


    int area = base * altezza;


    int perimetro = lat1+lat2+lat3;

    System.out.println("L'area è:" + area);
    System.out.println("L'perimetro è:" + perimetro);

  }
}
