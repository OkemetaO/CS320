package contact;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.Contact;
class ContactTest {
	
	@Test
	void testContact() {
		Contact contact = new Contact("2468", "Samuel", "Okemeta", "518882", "888 Shield ave");
		assertTrue(contact.getContactId().equals("2468"));
		assertTrue(contact.getFirstName().equals("Samuel"));
		assertTrue(contact.getLastName().equals("Okemeta"));
		assertTrue(contact.getPhoneNumber().equals("518882"));
		assertTrue(contact.getAddress().equals("888 Shield ave"));
	}

	//testing for too long or null input
	@Test
	void testCotactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("246889899393", "Samuel", "Okemeta", "518882", "888 Shield ave");
		});
}
	@Test
	void testCotactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Samuel", "Okemeta", "518882", "888 Shield ave");
		});
	}
	
	
	
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact ("2468", "Samueljacobs", "Okemeta", "518882", "888 Shield ave");
		});
	}

	@Test
	void testCotactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("2468", null, "Okemeta", "518882", "888 Shield ave");
		});
	}
	
	
	
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("2468", "Samuel", "OkemetaOlorungbe", "518882", "888 Shield ave");
		});
	}
	@Test
	void testCotactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("2468", "Samuel", null, "518882", "888 Shield ave");
		});
	}
	
	
	
	@Test
	void testContactPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("2468", "Samuel", "Okemeta", "123456789024", "888 Shield ave");
		});
	}
	@Test
	void testCotactPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("2469", "Samuel", "Okemeta", null, "888 Shield ave");
		});
	}
	
	
	
	
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("2468", "Samuel", "OkemetaOlorungbe", "518882", "888 Shield ave, pensacola 82030");
		});
	}
	@Test
	void testCotactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("2468", "Samuel", "Okemeta", "518882", null);
		});
	}
}

