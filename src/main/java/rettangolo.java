import java.util.Scanner;

public class rettangolo
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





    int area = base * altezza;


    int perimetro = base*2+altezza*2;



    System.out.println("L'area è:" + area);
    System.out.println("L'perimetro è:" + perimetro);

  }
}
