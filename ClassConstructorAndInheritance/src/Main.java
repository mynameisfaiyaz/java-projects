public class Main {

    public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount();
    bankAccount.setAccountNumber(113215);
    bankAccount.setBalance(20);
    bankAccount.setCustomerName("Faiyaz");
    bankAccount.setEmail("Something@gmail.com");
    bankAccount.setPhoneNumber(986112453);

    bankAccount.depositFunds(200);

        System.out.println(bankAccount.getBalance());
        bankAccount.withdrawFunds(50);
        System.out.println(bankAccount.getBalance());

    }
}
