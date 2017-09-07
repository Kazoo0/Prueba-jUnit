package calculadora;

public class Calculadora {
	
	private int ans;
	
	public Calculadora() {
		ans=0;
	}
	
	public int suma(int a, int b) {
		
		ans=a+b;
		return ans;
	}
	
	public int resta(int a, int b) {
		
		ans=a-b;
		return ans;
	}
	
	public int suma(int v) {
		ans+=v;
		return ans;
	}
	
	public int resta(int v) {
		ans-=v;
		return ans;
	}
	
	public int ans() {
		
		return ans;
	}
	
	public void clear() {
		ans=0;
	}
	
	public int div (int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("No se puede dividir por cero");
		}
		ans= a / b;
		return ans;
	}
	
	public void operacionOptima() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}

}
