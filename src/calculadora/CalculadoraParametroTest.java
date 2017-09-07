package calculadora;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CalculadoraParametroTest {
	
	@Parameters
	public static Iterable<Object[]> getData(){
		return Arrays.asList(new Object[][] {
			{3,1,4}, {2,3,5}, {3,3,6}
		});
	}
	
	private int a, b, exp;

	public CalculadoraParametroTest(int a, int b, int exp) {
		this.a=a;
		this.b=b;
		this.exp=exp;
	}
	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(a, b);
		assertEquals(exp,resultado);
	}

}
