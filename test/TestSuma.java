import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;


public class TestSuma {
	
	@Test
	public void testSumaEnteros(){
		assertEquals(6, Suma.sumaDosNumerosEnteros(3, 3));
	}
	
	@Test
	public void testSumaListaEnteros(){
		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add(5);
		lista.add(2);
		lista.add(3);
		
		assertEquals(10, Suma.sumaListaNumeroEnteros(lista));
	}
	
	@Test
	public void testSuma(){
		
		assertEquals(4.5, Suma.sumaDosNumeros(1.0, 3.5), 4.5);
				
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSumaListaNumeros(){
		List<Double> lista = new ArrayList<Double>();
		 
		lista.add(3.5);
		lista.add(4.5);
		lista.add(5.0);
		
		assertEquals(13.0, Suma.sumaListaNumeros(lista), 13.0);
		
	}

}
