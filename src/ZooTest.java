public class ZooTest
{

    
    public void constructorTest() throws AssertException
    {
    	
    }
    
    public void expandZooTest() throws AssertException
    {
    	
    }
    
    public void addAnimalTest() throws AssertException
    {
    	
    }
    
    public void getTotalHeightTest() throws AssertException
    {
    	
    }
    
    public void getAverageWeightTest() throws AssertException
    {
    	
    }
    
    public void getAverageWeightColorTest() throws AssertException
    {
    
    }
    
   
    public void getAnimalsTest() throws AssertException
    {
    	
    }
   
    public void getCapacityTest() throws AssertException
    {
    	
    }
    
    public void toStringTest() throws AssertException
    {
    	Equipment equipment = new Equipment("name/0,0,0,description");
    	Assert.assertEquals("Name: name, Number: 0, Weight: 0.00 lbs, Price: $0.00 - description", equipment.toString());
    }
}