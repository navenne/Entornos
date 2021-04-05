package entornos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BisiestoTest {
  
  @Test
  public void test1900() {
    boolean b = Bisiesto.esBisiesto(1900);
    assertFalse(b);
  }
  
  @Test
  public void test2000() {
  boolean b = Bisiesto.esBisiesto(2000);
  assertTrue(b);
  }
  
  @Test
  public void test2019() {
  boolean b = Bisiesto.esBisiesto(2019);
  assertFalse(b);
  }
  
  @Test
  public void test2020() {
  boolean b = Bisiesto.esBisiesto(2020);
  assertTrue(b);
  }

}