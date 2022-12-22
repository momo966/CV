import java.util.Scanner;

public class quadrato {
  public static void main(String[] args) {
    System.out.println("HELLO WORD");
    System.out.println("*----------------*");
    System.out.println("| MAHMOUD BASHA  |");
    System.out.println("*----------------*");


    Scanner input = new Scanner(System.in);

    System.out.println("Inserisci lat1:");
    int lat1 = input.nextInt();



    int area = lat1*lat1;


    int perimetro = lat1*4;

    System.out.println("L'area è:" + area);
    System.out.println("L'perimetro è:" + perimetro);

  }
}
