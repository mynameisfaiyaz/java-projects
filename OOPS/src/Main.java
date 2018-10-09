public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemSizeHamburger();

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total burger price "+hamburger.itemSizeHamburger());

        HealthyBurger healthyBurger= new HealthyBurger("Beef", 5.60);
        healthyBurger.itemSizeHamburger();
    }

}
