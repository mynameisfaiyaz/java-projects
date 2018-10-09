public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Axis Bank");

        bank.addBranch("Delhi");

        bank.addCustomer("Delhi", "Tuc", 50.05);
        bank.addCustomer("Delhi", "Sam", 76.42);
        bank.addCustomer("Delhi", "Pac", 40.09);

        bank.addBranch("Odisha");
        bank.addCustomer("Odisha", "Mikey", 84.35);

        bank.addCustomerTransaction("Delhi", "Tuc", 23.54);
        bank.addCustomerTransaction("Delhi", "Tuc", 13.26);
        bank.addCustomerTransaction("Delhi", "Tuc", 19.17);

        bank.listCustomers("Delhi", true);
    }
}
