import java.util.List;

public class Multiplica {
	
	public static int multiplicaDosNumeros(int a, int b){
		
		return a*b;
		
	}
	
	public static int multiplicaListaNumeros(List<Integer> list){
		int result = 1;
		
		for (Integer i : list){
			result = result*i;
		}
		
		return result;
	}
}
