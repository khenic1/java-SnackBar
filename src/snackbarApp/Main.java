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



    }
}

// 1. Customer 2 (Bob) buys 2 of snack 4 (Sode). Print Customer 2 (Bob) Cash on Hand. Print quantity of snack 4 (Soda).
// 1. Customer 1 (Jane) finds $10. Print Customer 1 (Jane) Cash on Hand.
// 1. Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar). Print Customer 1 (Jane) Cash on Hand. Print quantity of snack 2 (Chocolate Bar).
// 1. Add 12 more items to snack 3 (Pretzel). Print quantity of snack 3 (Pretzel).
// 1. Customer 2 (Bob) buys 3 of snack 3 (Pretzel). Print Customer 2 (Bob) Cash on hand. Print quantity of snack 3 (Pretzel).

// * Stretch Goals

//     * Display each snack with
//         * Name
//         * Vending Machine Name
//         * Quantity on hand
//         * Total cost of all of the quantities of this snack on hand
	