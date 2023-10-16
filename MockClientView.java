public class MockClientView {
  private Controller controller;

  public MockClientView(Controller controller) {
    this.controller = controller;
  }

  public void displayFirstLast(String id) {
    String contactInfo = controller.findAContact(Long.parseLong(id));
    System.out.println(contactInfo);
  }

  public void addAContact(String id, String first_name, String last_name) {
    controller.addAContact(Long.parseLong(id), first_name, last_name);
  }

  public static void main(String[] args) {
    Controller controller = new Controller();
    MockClientView clientView = new MockClientView(controller);

    clientView.addAContact("1", "John", "Doe");
    clientView.addAContact("2", "Jane", "Smith");

    clientView.displayFirstLast("1");
    clientView.displayFirstLast("2");
  }
}