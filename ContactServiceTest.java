import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class contactServiceTest {
	
	// need to test add, delete and update
	// templates
	/*
	 * Contact("14113252", "Jane", "Doe", "4444444444", "Sample 24 Drive");
	 * Contact("1309403", "Malleus", "Draconia", "2187123404", "Valley of Thorns");
	 * Contact("9752319", "Vil", "Schoenheit", "9215501793", "Land of Proxynee");
	 */
	
	@Test
	public void testAdd()
	{
		ContactService cs = new ContactService();
		Contact test1 = new Contact("1413252", "Jane", "Does", "4444444444");
		assertEquals(true, cs.addContact(test1));
	}
	
	@Test
	public void testDelete()
	{
		ContactService cs = new ContactService();
		
		Contact test1 = new Contact("1413252", "Jane", "Doe", "4444444444");
		Contact test2 = new Contact("1309403", "Malleus", "Draconia", "2187123404");
		Contact test3 = new Contact("9752319", "Vil", "Schoenheit", "9215501793");
		
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		assertEquals(true, cs.updateContact("9752319", "VilFirst", "SchoenheitLast", "9215501793", "Land of Proxynee"));
		assertEquals(false, cs.updateContact("9752322", "VilFirst", "SchoeheitLast", "9215501793", "Land of Proxynee"));

	}
}