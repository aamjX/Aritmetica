
public class Resta {
	
	public static int restaDosNumerosEnteros(int a, int b) {
		//añadiendo variable
		int result = a - b;
		return result;
	}
	//No permite que salgan numeros positivos
	public static double restaDosNumeros(double a, double b) {
		double result = 0; 
		if(a<b){
			result = b - a;
		}
		else{
			result = a -b;
		}
		
		return result;
	}
}
