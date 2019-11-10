package snackbarApp;


class Main {
    public static void main(String[] args) {
        Customer jane = new Customer(1, "Jane", 45.25);
        Customer bob = new Customer(2, "Bob", 33.14);

        VendingMachine food = new VendingMachine(1, "Food");
        VendingMachine drink = new VendingMachine(2, "Drink");
        VendingMachine office = new VendingMachine(3, "Office");

        Snack chips = new Snack(1, "chips", 36, 1.75, food.getId());
        Snack chocolate = new Snack(2, "chocolate", 36, 1.00, food.getId());
        Snack pretzels = new Snack(3, "pretzels", 30, 2.00, food.getId());
        Snack soda = new Snack(4, "soda", 24, 2.50, drink.getId());
        Snack water = new Snack(5, "water", 20, 2.75, drink.getId());

        jane.buy(soda, 3);
        System.out.println(jane.getCash());
        System.out.println(soda.getQuantity());

        jane.buy(pretzels, 1);
        System.out.println(jane.getCash());
        System.out.println(pretzels.getQuantity());

        bob.buy(soda, 2);
        System.out.println(bob.getCash());
        System.out.println(soda.getQuantity());

        jane.addCash(10.0);
        System.out.println(jane.getCash());

        jane.buy(chocolate, 1);
        System.out.println(jane.getCash());
        System.out.println(chocolate.getQuantity());

        pretzels.addQuantity(12);
         System.out.println(pretzels.getQuantity());

         bob.buy(pretzels, 3);
         System.out.println(bob.getCash());
         System.out.println(pretzels.getQuantity());



    }
}


// * Stretch Goals

//     * Display each snack with
//         * Name
//         * Vending Machine Name
//         * Quantity on hand
//         * Total cost of all of the quantities of this snack on hand
	