public class Main {

    public static void main(String[] args) {

        //Create a new class for a bank account
        //Create fields for the account number, balance , customer name, email and phone Number
        //Create getters and setters for each fields
        //Create two additional method
        //1. To allow the Customer to deposit funds (this should increment the balance filed)
        //2. To allow the Customer to withdrawal funds. this should deduct from the balance field
        //but not allow the withdrawal to complete if their are insufficient funds.
        //You will want to Create various code in the Main class (the One Created by Intellij) to
        //Confirm your code is working
        //Add some System.out.println's in the two methods above as well.

        Account bobsAcount = new Account();

        System.out.println(bobsAcount.getNumber());
        System.out.println(bobsAcount.getBalance());
        bobsAcount.setNumber("12345");
        bobsAcount.setBalance(0.00);
        bobsAcount.setCustomerName("Bob Brown");
        bobsAcount.setCustomerEmailAddress("myemail@gmail.com");
        bobsAcount.setCustomerPhoneNumber("0719484749");

        bobsAcount.withdrawal(100.0);

        bobsAcount.deposit(50.0);
        bobsAcount.withdrawal(100.0);

        bobsAcount.deposit(51.0);
        bobsAcount.withdrawal(100.0);

        Account timeAccount = new Account("Tin","time@gmail.com","12345");
        System.out.println(timeAccount.getNumber()+ " name " + timeAccount.getCustomerName());


        //create a new class VipCustomer
        //it should have 3 fields name,credit Limit , and email address
        //create 3 constructor
        //1st constructor empty should call the constructor with 3 parameters with default values
        //2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        //3rd constructor should save all fields
        //create getters only for this using code generation of intellij as setters wont be needed
        //test and confirm it works.
        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob",2500.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tin",100.00,"tin@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());


    }
}
