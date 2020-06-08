package ObjectsAndClasses;

import java.util.Date;

public class Classes {
    public static void main(String[] args) {
        agregationExample();
    }


    public static void agregationExample() {
          Account account = new Account("John", 1000);
          Order order = new Order("Buy op", account);
          System.out.println(order.getCreated());

          //static field and static method in class
          String bank = Account.bank;
          String bank1 = Account.getBank();
    }

}
//The most common relationships between classes are
  //Dependence (“uses–a”)
  //Mimimize dependances between classes (less coupling between classes)

//Aggregation (“has–a”)
class Order {
    private String name;
    private Account account;
    private Date created;

    public Order(String name, Account account) {
        this.name = name;
        this.account = account;
        this.created = new Date();
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public Date getCreated() {
        return created;
    }

}

class Account {
    private String owner;
    private long id;
    public static final String bank = "Santander";

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
    public static String getBank(){
        return bank;
    }
}


  //Inheritance (“is–a”)Ex RushOrder classinherits from an Order class