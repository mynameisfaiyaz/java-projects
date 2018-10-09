public class Main2 {
    public static void main(String[] args) {
        VipCustomer vipCustomer = new VipCustomer("Faiyaz",5000,"something@mail.com");
        System.out.println(vipCustomer.getCrediLimit());

        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getEmail());

    }
}
