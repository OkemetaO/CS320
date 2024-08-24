package ContactService;
import java.util.ArrayList;

import contact.Contact;

public class ContactService {
	private ArrayList<Contact> contacts;
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	//Add
	public boolean add(Contact contact) {
		boolean alreadyPresent = false;
		for (Contact c: contacts) {
			if (c.equals(contact)) {
				alreadyPresent = true;
			}
		}
		
		if(!alreadyPresent) {
			contacts.add(contact);
			System.out.println("Contact added");
			return true;
		}else {
			System.out.println("Contact already available");
			return false;
		}
	}
	
	//Removing
	public boolean remove(String contactId) {
		for (Contact c: contacts) {
			if (c.getContactId().equals(contactId)) {
				contacts.remove(c);
				System.out.println("Contact removed");
				return true;
			}
		}
		System.out.println("Contact no longer agailable");
		return false;
	}
	
	//Updating
	public boolean update(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		for (Contact c: contacts) {
			if(c.getContactId().equals(contactId)) {
				if (!firstName.equals(""))
					c.updateFirstName(firstName);
				if(!lastName.equals(""))
					c.updateLastName(lastName);
				if(!phoneNumber.equals(""))
					c.updatePhoneNumber(phoneNumber);
				if(!address.equals(""))
					c.updateAddress(address);
				System.out.println("Contact Updates");
				return true;
					
			}
		}
		System.out.println("Contact unavailable");
		return false;
	}
}