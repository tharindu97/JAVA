public class VipPerson {
    private String name;
    private  double creditLimit;
    private String emailAddress;

    public VipPerson(){
        this("Default name",50000.00, "default@gmail.com");
    }

    public VipPerson(String name, double creditLimit) {
        this(name,creditLimit,"unknow@gmail.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}
