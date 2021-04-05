package entornos;


public class BusquedaBinaria {

  /**
   * Busca un número entero en un array de enteros ordenados de mayor a menor entre los hiIndex
   * primeros elementos
   * 
   * @param x Array de enteros ordenados de menor a mayor.
   * @param srch Número entero que se desea encontrar en el array x.
   * @return false si no lo encuentra y true si lo encuentra.
   * @throws ArrayNoOrdenadoException si los primeros hiIndex números del array no están ordenados
   *         de menor a mayor
   * @throws IndexOutOfBoundsException si hiIndex es mayor que la longitud del array
   * @hiIndex es el tope de longitud de x en el que buscará srch
   */
  public boolean buscar(int[] x, int srch, int hiIndex) throws ArrayNoOrdenadoException {
    int loIndex = 0; // 1
    int midIndex;


    if (hiIndex > x.length - 1) // 2
      throw new IndexOutOfBoundsException("hiIndex debe ser menor que la longitud del array"); // 3

    for (int i = 0; i < hiIndex; i++) // 4
      if (x[i] > x[i + 1]) // 5
        throw new ArrayNoOrdenadoException(
            "Los primeros " + hiIndex + " elementos del array NO están ordenados"); // 6

    while (loIndex <= hiIndex) { // 7
      midIndex = (loIndex + hiIndex) / 2; // 8
      if (srch > x[midIndex]) // 9
        loIndex = midIndex + 1; // 10
      else if (srch < x[midIndex]) // 11
        hiIndex = midIndex - 1; // 12
      else
        break; // 13
    }
    if (loIndex > hiIndex) // 14
      return false; // 15
    else
      return true; // 16

  }

  public static void main(String[] args) {
    BusquedaBinaria v = new BusquedaBinaria();
    int x[] = {1, 2, 44, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    try {
      if (v.buscar(x, 13, 13)) {
        System.out.println("Encontrado !!");
      } else {
        System.out.println("No encontrado");
      }
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (ArrayNoOrdenadoException e) {
      System.out.println("Error: " + e.getMessage());
    }

  }
}
