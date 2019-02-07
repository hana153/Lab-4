/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    
    public void fullConstructorTest() throws AssertException
    {
    	//Using non-default constructor
    	Animal animal2 = new Animal("red", "panda", 20.00, 10.00);
    	
    	//Should be: red, panda, 20.0 weight and 10.0 height
    	 Assert.assertEquals("red", animal2.getColor());
         Assert.assertEquals("panda", animal2.getName());
         Assert.assertEquals(10.00, animal2.getHeight(), 0.01);
         Assert.assertEquals(20.00, animal2.getWeight(), 0.01);
    	
    }
    
    public void getterTest() throws AssertException
    {
    	
    }
    
    public void toStringTest() throws AssertException
    {
    	
    }
}


