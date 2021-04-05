package entornos;

public class Bisiesto {
  
  public static boolean esBisiesto(int anio) {
    if (anio % 4 == 0) {
      if (anio % 100 == 0 && anio % 400 == 0) {
        return true;
      } else {
        if (anio % 100 == 0) {
          return false;
        }
      }
    } else {
      return false;
    }
    return true;
  }
}
