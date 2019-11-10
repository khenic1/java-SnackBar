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
        cash += amount;
    }
    public void buy(Snack snack, int amount) {
       double cost = snack.getCost(amount);
       if (this.cash >= cost) {
           snack.buySnack(amount);
           this.cash -= cost; 
       }
    }


}



