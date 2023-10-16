public class Controller {
  private LocalRepository repository;

  public Controller() {
    repository = new LocalRepository();
  }

  public void addAContact(long id, String first_name, String last_name) {
    Contact contact = new Contact(id, first_name, last_name);
    repository.addContact(contact);
  }

  public String findAContact(long id) {
    Contact contact = repository.getContact(id);
    if (contact != null) {
      return contact.toString();
    } else {
      return "Contact not found";
    }
  }
}
