
public class Resta {
	
	public static int restaDosNumerosEnteros(int a, int b) {
<<<<<<< HEAD
		int r = b -a;
		return r;
=======
		//añadiendo variable
		int result = a - b;
		return result;
>>>>>>> develop
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
