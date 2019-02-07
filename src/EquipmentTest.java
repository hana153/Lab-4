public class EquipmentTest
{

    
    public void fullConstructorTest() throws AssertException
    {
    	Equipment equipment = new Equipment("name/0,0,0,description");
    	
    	Assert.assertEquals("name", equipment.getName());
    	Assert.assertEquals(0, equipment.getCount(), 0.01);
    	Assert.assertEquals(0, equipment.getTotalWeight(), 0.01);
    	Assert.assertEquals(0, equipment.getTotalPrice(), 0.01);
    	Assert.assertEquals("description", equipment.getDescription());
    }
    
    public void getNameTest() throws AssertException
    {
    	Equipment equipment = new Equipment("name/0,0,0,description");
    	Assert.assertEquals("name", equipment.getName());
    }
    
    public void getCountTest() throws AssertException
    {
    	Equipment equipment = new Equipment("name/0,0,0,description");
    	Assert.assertEquals(0, equipment.getCount(), 0.01);
    }
    
    public void getTotalWeightTest() throws AssertException
    {
    	Equipment equipment = new Equipment("name/0,0,0,description");
    	Assert.assertEquals(0, equipment.getTotalWeight(), 0.01);
    }
    
    public void getTotalPriceTest() throws AssertException
    {
    	Equipment equipment = new Equipment("name/0,0,0,description");
    	Assert.assertEquals(0, equipment.getTotalPrice(), 0.01);
    }
   
    public void getDescriptionTest() throws AssertException
    {
    	Equipment equipment = new Equipment("name/0,0,0,description");
    	Assert.assertEquals("description", equipment.getDescription());
    }
    
    public void toStringTest() throws AssertException
    {
    	Equipment equipment = new Equipment("name/0,0,0,description");
    	Assert.assertEquals("Name: name, Number: 0, Weight: 0.00 lbs, Price: $0.00 - description", equipment.toString());
    }
}