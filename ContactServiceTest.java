package ContactService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import contact.Contact;
import ContactService.ContactService;

public class ContactServiceTest {
	@Test
	public void testMethodAdd() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("1", "Sam", "King", "555-1111", "111 A St");
		Contact c2 = new Contact("2", "David", "Joe", "55-222", "222 B St");
		Contact c3 = new Contact("3", "Noela", "Queens", "555-3333", "333 C St");
		
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
	}
	
	@Test
	public void testMethodDelete() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("1", "Sam", "King", "555-1111", "111 A St");
		Contact c2 = new Contact("2", "David", "Joe", "55-222", "222 B St");
		Contact c3 = new Contact("3", "Noela", "Queens", "555-3333", "333 C St");
		
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
		
		assertEquals(true, cs.remove("1"));
		assertEquals(true, cs.remove("2"));
	}
	
	@Test
	public void testMethodUpdate() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("1", "Sam", "King", "555-1111", "111 A St");
		Contact c2 = new Contact("2", "David", "Joe", "55-222", "222 B St");
		Contact c3 = new Contact("3", "Noela", "Queens", "555-3333", "333 C St");
		
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
		assertEquals(true, cs.add(c3));
		
		assertEquals(true, cs.update("2", "Davvy", "Joelly", "222-456", "567 U St"));
		assertEquals(true, cs.update("3", "Noelly", "Khings", "634-8127", "764 T St"));
	}
}