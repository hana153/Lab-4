public class ZooTest
{
    
    public void getTotalHeightTest() throws AssertException
    {
    	Animal animal1 = new Animal("red", "panda", 0, 10);
    	Animal animal2 = new Animal("yellow", "cat", 0, 15);
    	Zoo zoo1 = new Zoo(5);
    	zoo1.addAnimal(animal1);
    	zoo1.addAnimal(animal2);
    	Assert.assertEquals(25.00, zoo1.getTotalHeight(), 0.01);
    	
    }
    
    public void getCapacityTest() throws AssertException
    {
    	Animal animal1 = new Animal("red", "panda", 0, 10);
    	Animal animal2 = new Animal("yellow", "cat", 0, 15);
    	Zoo zoo1 = new Zoo(5);
    	zoo1.addAnimal(animal1);
    	zoo1.addAnimal(animal2);
    	Assert.assertEquals(5.00, zoo1.getCapacity(), 0.01);
    }
    
    public void toStringTest() throws AssertException
    {
    	Equipment equipment = new Equipment("name/0,0,0,description");
    	Assert.assertEquals("Name: name, Number: 0, Weight: 0.00 lbs, Price: $0.00 - description", equipment.toString());
    }
}