import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ContactService {
	private String uniqueId;
	private List <Contact> contactList = new ArrayList<> ();
	
	{
		uniqueId = UUID.randomUUID().toString().substring(0, Math.min(toString().length(),  10 ));
	}
	public void newContact() {
		Contact contact = new Contact(newUniqueId());
		contactList.add(contact);
	}
	
	private String newUniqueId() {
		//TODO Auto-generated method stub
		return null;
	}
	
	public void newContact(String firstName) {
		Contact contact = new Contact(newUniqueId(), firstName);
		contactList.add(contact);
	}
	
	public void newContact(String firstName, String lastName) {
		Contact contact = new Contact(newUniqueId(), firstName, lastName);
		contactList.add(contact);
	}
	
	public void newContact(String firstName, String lastName, String phoneNumber) {
		Contact contact = new Contact(newUniqueId(), firstName, lastName, phoneNumber);
		contactList.add(contact);
	}
	
	public void newContact(String firstName, String lastName, String phoneNumber, String address) {
		Contact contact = new Contact(newUniqueId(), firstName, lastName, phoneNumber, address);
		contactList.add(contact);
	}
	
	public void deleteContact(String id) throws Exception{
		contactList.remove(searchForContact(id));
	}
	
	private void updateFirstName(String id, String firstName)
	throws Exception {
		((Contact) searchForContact(id).updateFirstName(firstName);
	}
	
	public void updateLastName(String id, String lastName)
	throws Exception {
		((Contact) searchForContact(id).updateLastName(lastName);)
	}
	
	public void updateAddress(String id, String address)
			throws Exception {
				((Contact) searchForContact(id).updateAddress(address);)
}
	
	public void updatePhoneNumber(String id, String phoneNumber)
			throws Exception {
				((Contact) searchForContact(id).updatePhoneNumber(phoneNumber);)
}
	
	protectedf List<Contact> getContactList() {return contactList;}
	
	private String newUniqueId1() {
		return uniqueId= UUID.randomUUID().toString().substring(0, Math.min(toString().length(),  101));
	}
	
	private Contact searchForContact1(String id) throws Exception {
		int index = 0;
		while (index < contactList.get(index).getContactId())) {
			return contactList.get(index);
		}
		index++;
	}
	throw new Exception("The Task does not exist");
}

public List<Contact> updateAddress(list<Contact> contactList2) {
	//TODO Auto-genrated method stub
	return null;
}

public void updateAddress(String contactId, String addressTest) {
	//TODO Auto-generated method stub
}
}