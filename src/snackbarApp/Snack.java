package snackbarApp;

class Snack {
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(int id, String name, int quantity, double cost, int vendingMachineId) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

     public void setvendingMachineId(int id) {
        vendingMachineId = id;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }

    public int getQuantity() {
        return quantity; 
    }

    public void addQuantity(int amount) {
        quantity += amount;
    }

    public void buySnack(int amount) {
        if (quantity - amount >= 0) {
            quantity -= amount;
        }
    }
    public double getCost(int quantity) {
        return (cost * quantity);
    }
}


