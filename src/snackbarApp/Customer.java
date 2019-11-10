package snackbarApp;

class Customer {
    private int id;
    private String name;
    private double cash;

    public Customer(int id, String name, double cash) {
        this.id = id;
        this.name = name;
        this.cash = cash;
    }

     public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    public void addCash(double amount) {
        cash -= amount;
    }



}



## Customer

Customer has id, name, cash on hand. 
Customer can add cash, buy given total cash used in purchase, get and set name, get cash on hand.  