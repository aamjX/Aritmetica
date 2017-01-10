import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestResta {

	@Test
	public void testRestaEnteros(){
		
		assertEquals(5, Resta.restaDosNumerosEnteros(10, 5));
		
	}
	
	@Test
	public void testResta(){
		assertEquals(3.5, Resta.restaDosNumeros(7.0, 3.5),3.5);
	}
	
}
