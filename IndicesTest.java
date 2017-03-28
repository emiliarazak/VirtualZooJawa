package indices;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import indices.Indices;

public class IndicesTest {
	  
	  public IndicesTest() {
	  }
	  
	  @BeforeClass
	  public static void setUpClass() {
	  }
	  
	  @AfterClass
	  public static void tearDownClass() {
	  }

	  /**
	   * Test of Copy method, of class indices.
	   */
	  @Test
	  public void testCopyIndices() {
	    System.out.println("Copy");
	    Indices ind = new Indices(1,1);
	    Indices instance = new Indices();
	    instance.CopyIndices(ind);
	    assertEquals(instance.GetAbsis(), 1);
	    assertEquals(instance.GetOrdinat(), 1);
	  }

	  /**
	   * Test of GetAbsis method, of class indices.
	   */
	  @Test
	  public void testGetAbsis() {
	    System.out.println("GetAbsis");
	    Indices instance = new Indices(3,3);
	    int expResult = 3;
	    int result = instance.GetAbsis();
	    assertEquals(expResult, result);
	  }

	  /**
	   * Test of GetOrdinat method, of class indices.
	   */
	  @Test
	  public void testGetOrdinat() {
	    System.out.println("GetOrdinat");
	    Indices instance = new Indices(4,4);
	    int expResult = 4;
	    int result = instance.GetOrdinat();
	    assertEquals(expResult, result);
	  }

	  /**
	   * Test of SetAbsis method, of class indices.
	   */
	  @Test
	  public void testSetAbsis() {
	    System.out.println("SetAbsis");
	    int x = 0;
	    Indices instance = new Indices(1,1);
	    instance.SetAbsis(x);
	    assertEquals(instance.GetAbsis(), x);
	  }

	  /**
	   * Test of SetOrdinat method, of class indices.
	   */
	  @Test
	  public void testSetOrdinat() {
	    System.out.println("SetOrdinat");
	    int y = 0;
	    Indices instance = new Indices(1,1);
	    instance.SetOrdinat(y);
	    assertEquals(instance.GetOrdinat(), y);
	  }

	  /**
	   * Test of IsEqual method, of class indices.
	   */
	  @Test
	  public void testIsEqual() {
	    System.out.println("IsEqual");
	    Indices ind = new Indices(0,1);
	    Indices instance = new Indices(1,0);
	    boolean expResult = false;
	    boolean result = instance.IsEqual(ind);
	    assertEquals(expResult, result);
	  }

	  /**
	   * Test of PrintKoordinat method, of class indices.
	   */
	  @Test
	  public void testPrintKoordinat() {
	    System.out.println("PrintKoordinat");
	    Indices instance = new Indices(7,7);
	    instance.PrintKoordinat();
	  }
	  
}
