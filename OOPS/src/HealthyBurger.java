public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthExtra1Price;

    private String healthyExtra2Name;
    private double healthExtra2Price;

    public HealthyBurger(String meat, double price){
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthExtra2Price = price;
    }

    @Override
    public double itemSizeHamburger() {
        double hamburgerPrice = super.itemSizeHamburger();
        if(this.healthyExtra1Name != null){
            hamburgerPrice += this.healthExtra1Price;

        }
    }
}
