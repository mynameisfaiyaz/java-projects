public class VipCustomer {

    private String name;
    private int crediLimit;
    private String email;

    public VipCustomer() {
        this("Default name",0,"default@mail.com");
    }

    public VipCustomer(String name, int crediLimit) {
        this(name,crediLimit,"default@mail.com");
    }

    public VipCustomer(String name, int crediLimit, String email) {
        this.name = name;
        this.crediLimit = crediLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCrediLimit() {
        return crediLimit;
    }

    public String getEmail() {
        return email;
    }
}
