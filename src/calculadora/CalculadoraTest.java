package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora calc;
	@Before
	public void before() {
		calc=new Calculadora();
	}
	
	@After
	public void after() {
		calc.clear();
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
	
	@Test(timeout=100)
	public void testAlgoritmoOptimo() {
		calc.operacionOptima();
	}
}
