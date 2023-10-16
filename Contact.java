public class Contact {
  long id;
  String first_name, last_name;

  public Contact(long id, String first_name, String last_name) {
    this.id = id;
    this.first_name = first_name;
    this.last_name = last_name;
  }

  public String toString() {
    return "id: " + id + ", First Name: " + first_name + ", Last Name: " + last_name + ".";
  }

  public long getId() {
    return id;
  }

  // public void setId() {
  //   this.id = id;
  // }

  public String getFirst_name() {
    return first_name;
  }

  // public void setFirst_name() {
  //   this.first_name = first_name;
  // }

  public String getLast_name() {
    return last_name;
  }

  // public void setLast_name() {
  //   this.last_name = last_name;
  // }
}
