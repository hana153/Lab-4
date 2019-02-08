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
    	Animal animal = new Animal("red", "panda", 20.00, 10.00);
    	
    	//Should be: red, panda, 20.0 weight and 10.0 height
    	 Assert.assertEquals("red", animal.getColor());
         Assert.assertEquals("panda", animal.getName());
         Assert.assertEquals(10.00, animal.getHeight(), 0.01);
         Assert.assertEquals(20.00, animal.getWeight(), 0.01);
    	
    }
    
    public void getNameTest() throws AssertException
    {
    	Animal animal = new Animal();
    	Assert.assertEquals("noname", animal.getName());
    }
    
    public void getColorTest() throws AssertException
    {
    	Animal animal = new Animal();
    	Assert.assertEquals("unknown", animal.getColor());
    }
    
    public void getWeightTest() throws AssertException
    {
    	Animal animal = new Animal();
    	Assert.assertEquals(0, animal.getHeight(), 0.01);
    }
    
    public void getHeightTest() throws AssertException
    {
    	Animal animal = new Animal();
    	Assert.assertEquals(0, animal.getHeight(), 0.01);
    }
    
    public void toStringTest() throws AssertException
    {
    	Animal animal = new Animal();
    	Assert.assertEquals("noname, a unknown-colored animal. 0.0 pounds, 0.0 inches\n", animal.toString());
    }
    
    public void isequalTest() throws AssertException
    {
    	Animal animal1 = new Animal("red", "panda", 20.00, 10.00);
    	Animal animal2 = new Animal("red", "panda", 20.00, 10.00);
    	Assert.assertEquals(true, animal1.equals(animal2));
    	Animal animal3 = new Animal("red", "panda", 20.00, 10.00);
    	Animal animal4 = new Animal("yellow", "panda", 20.00, 10.00);
    	Assert.assertEquals(false, animal3.equals(animal4));
    }
}


