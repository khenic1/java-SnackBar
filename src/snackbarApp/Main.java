package snackbarApp;


class Main {
    public static void main(String[] args) {
        Snack doritos = new Snack(1, "doritos", 10, 1.5, 1);
        doritos.addQuantity(10);
        doritos.buySnack(11);
        System.out.println(doritos.getQuantity());
        System.out.println(doritos.getCost(3));
    }
}