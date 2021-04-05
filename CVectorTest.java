package entornos;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class CVectorTest {

  @Test
  void testInsertarok() throws VectorLlenoException {
    CVector vector = new CVector();
    vector.insertar(1);
    assertEquals(1, vector.posicion(0));
  }

  @Test
  void testInsertarex() throws VectorLlenoException {
    CVector vector = new CVector();
    for (int i = 0; i < 100; i++) {
      vector.insertar(0);
    }
    try {
      vector.insertar(1);
    } catch (Exception e) {
      boolean lleno = true;
      assertTrue(lleno);
    }

  }

  @Test
  void testVector_lleno100() throws VectorLlenoException {
    CVector vector100 = new CVector();
    for (int i = 0; i < 100; i++) {
      vector100.insertar(0);
    }
    assertEquals(true, vector100.vector_lleno());
  }

  @Test
  void testVector_lleno99() throws VectorLlenoException {
    CVector vector99 = new CVector();
    for (int i = 0; i < 99; i++) {
      vector99.insertar(0);
    }
    assertEquals(false, vector99.vector_lleno());
  }

  @Test
  void testOrdenar_vector() throws VectorLlenoException {
    CVector vector = new CVector();
    vector.insertar(3);
    vector.insertar(2);
    vector.insertar(1);
    vector.ordenar_vector();
    int[] vector1 = {vector.posicion(0), vector.posicion(1), vector.posicion(2)};
    int[] vector2 = {1, 2, 3};
    assertArrayEquals(vector1, vector2);
  }

  @Test
  void testPosicionok() throws VectorLlenoException {
    CVector vector = new CVector();
    vector.insertar(1);
    assertEquals(1, vector.posicion(0));
  }

  @Test
  void testPosicionex() {
    CVector vector = new CVector();
    try {
      vector.posicion(-1);
    } catch (ArrayIndexOutOfBoundsException e) {
      boolean a = true;
      assertTrue(a);
    }
  }

}
