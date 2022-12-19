import static org.junit.Assert.*;

import org.junit.Test;


public class TrianguloTest {
	@Test
	public void test1() {
		Triangulo triangulo = new Triangulo(2,2,2,60,60,60);

	    Main main = new Main(triangulo, "", "");
	    main.CalcularTipo();
	    main.CalcularTipoAngulo();
	    String actual = main.CompararTipos();
	    
	 
	    String expected = "El triangulo es EQUILATERO y ACUTÁNGULO";
	 
	    assertEquals(expected, actual);
	}
	
}
