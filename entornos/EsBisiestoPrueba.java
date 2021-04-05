package entornos;

import java.util.Scanner;

public class EsBisiestoPrueba {
  public static void main(String[] args) {
    int anio;
    Scanner input = new Scanner(System.in);
    anio = input.nextInt();
    if (Bisiesto.esBisiesto(anio)) {
      System.out.printf("El año %d es bisiesto", anio);
    } else {
      System.out.printf("El año %d no es bisiesto", anio);
    }
  }
}
