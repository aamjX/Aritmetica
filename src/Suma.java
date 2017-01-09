import java.util.List;

public class Suma {

	public static int sumaDosNumerosEnteros(int a, int b) {
		
		return a + b;
	}

	public static int sumaListaNumeroEnteros(List<Integer> list) {
		int result = 0;
		
		for (Integer i : list) {
			result = result + i;
		}
		
		return result;
	}
	
	public static double sumaDosNumeros(double a, double b){
		
		return a + b;
	}
	
	public static double sumaListaNumeros(List<Double> list){
		double result = 0;
		
		for (Double d: list){
			result = result + d;
		}
		
		return result;
	}
}
