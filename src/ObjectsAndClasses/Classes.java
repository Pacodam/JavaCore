package ObjectsAndClasses;

public class Classes {
    public static void main(String[] args) {
        agregationExample();
    }


    public static void agregationExample() {
          Account account = new Account("John", 1000);
          Order order = new Order("Buy op", account);
          System.out.println(order.getAccount().getOwner());
    }

}
//The most common relationships between classes are
  //Dependence (“uses–a”)
  //Mimimize dependances between classes (less coupling between classes)

//Aggregation (“has–a”)
class Order {
    private String name;
    private Account account;

    public Order(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}

class Account {
    private String owner;
    private long id;

    public Account(String owner, long id) {
        this.owner = owner;
        this.id = id;
    }
    public String getOwner(){
        return owner;
    }
    public long id() {
        return id;
    }
}


  //Inheritance (“is–a”)Ex RushOrder classinherits from an Order class