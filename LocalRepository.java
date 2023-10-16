import java.util.HashMap;

public class LocalRepository {
  private HashMap<Long, Contact> contactMap;

  public LocalRepository() {
    contactMap = new HashMap<>();
  }

  public void addContact(Contact contact) {
    contactMap.put(contact.getId(), contact);
  }

  public Contact getContact(long id) {
    return contactMap.get(id);
  }
}
