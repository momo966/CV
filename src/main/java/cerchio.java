import java.util.Date;
import java.util.Scanner;
import java.lang.Math;

public class cerchio {
  public static void main(String[] args) {
    System.out.println("HELLO WORD");
    System.out.println("*----------------*");
    System.out.println("| MAHMOUD BASHA  |");
    System.out.println("*----------------*");


    Scanner input = new Scanner(System.in);

    System.out.println("Inserisci raggio del cerchio:");
    int raggio= input.nextInt();

    int diametro= raggio*2;

    double PI_GRECO = Math.PI;



    Double area =(raggio*raggio)*PI_GRECO;


    Double perimetro = diametro * PI_GRECO;

    System.out.println("L'area è:" + area);
    System.out.println("L'perimetro è:" + perimetro);

  }
}
