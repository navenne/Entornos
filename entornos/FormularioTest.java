/**
 * @author Laura Hidalgo Rivera
 */

package entornos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FormularioTest {
  
  String p1 = "manzanilla1";
  String p2 = "manzanilla123456789";
  String p3 = "manzana";
  
  @BeforeAll
  static void testsComienzan() {
    System.out.println("Comienzan los tests");
  }
  
  
  @AfterAll
  static void testsRealizados() {
    System.out.println("Se han realizado todos los tests");
  }
  
  @BeforeEach
  void testComienza() {
    System.out.println("Comienza el test");
  }
  
  @AfterEach
  void testRealizado() {
    System.out.println("Se ha realizado el test");
  }
  
  @Test
  void testPassValido() throws Exception {
    String u = "usuario";
    Formulario f = new Formulario(u, p1);
    boolean valido = f.passValido(p1);
    assertTrue(valido);
  }

  @Test
  void testPassValido2() throws Exception {
    String u = "usuario";
    Formulario f = new Formulario(u, p2);
    boolean valido = f.passValido(p2);
    assertFalse(valido);
  }
  
  @Test
  void testPassValido3() throws Exception {
    String u = "usuario";
    Formulario f = new Formulario(u, p3);
    boolean valido = f.passValido(p3);
    assertFalse(valido);
  }

}
