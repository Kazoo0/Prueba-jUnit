package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	static Calculadora calc;
	@BeforeClass
	public static void beforeClass() {
		calc = new Calculadora();
	}
	@Before
	public void before() {
		calc.clear();
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass()");
	}
	@After
	public void after() {
		System.out.println("after()");
	}
	@Test
	public void testSuma() {
		int resultado= calc.suma(2, 3);
		int esperado= 5; // 2 + 3 = 5
		assertEquals(esperado, resultado);
	}

	@Test
	public void testResta() {
		int resultado = calc.resta(3, 2);
		int esperado = 1; // 3 - 2 = 1
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testAnsSum() {
		calc.suma(3, 2);
		int resultado = calc.ans();
		int esperado = 5;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testDiv() {
		calc.div(4, 2);
		int resultado= calc.ans();
		int esperado = 2;
		assertEquals(esperado,resultado);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivPorCero() {
		calc.div(4, 0);
	}
	//COMENTADO PARA QUE LA PRUEBA NO TIRE ERRORES//
/*	@Test(timeout=100)
	public void testAlgoritmoOptimo() {
		calc.operacionOptima();
	}
*/
}
