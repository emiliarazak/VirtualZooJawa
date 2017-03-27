import static org.junit.Assert.*;

import org.junit.*;

/**
 * 
 */

/**
 * @author Luthfi Fadillah
 *
 */
public class RenderableTest implements Renderable{

	private char test;

	/**
	 * Constructor dari RenderableTest.
	 */
	public RenderableTest(){
		test = 'A';
	}
	
	/**
	 * Realisasi Method render().
	 */
	public char render(){
		return 'A';
	}
	
	/**
	 * Test method for {@link Renderable#render()}.
	 */
	@Test
	public void testRender() {
		assertEquals("Method render Error!",test,render());
	}
}
