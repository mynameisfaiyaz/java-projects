public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Sam",56.43);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(23.64);
        System.out.println("Balance of customer "+ customer.getName() + " is " + customer.getBalance());

    }

}
