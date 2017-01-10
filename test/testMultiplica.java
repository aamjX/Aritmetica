import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class testMultiplica {
	
	@Test
	public void testMultiplicaDosEnteros(){
		
		assertEquals(10, Multiplica.multiplicaDosNumeros(2, 5));
	}
	
	@Test
	public void testMultiplicaListaEnteros(){
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(2);
		list.add(0);
		
		assertEquals(0, Multiplica.multiplicaListaNumeros(list));
	}
	
	
}
