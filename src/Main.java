public class Main {
    public static void main(String[] args) {

        SBIaccount arifAcc = new SBIaccount("Arif", "arif123", 10000);

        System.out.println(arifAcc); // printed the attricutes via toString

        // fetch balance
        System.out.println(arifAcc.fetchBalance("random"));  // wrong password
        System.out.println(arifAcc.fetchBalance("arif123"));  //correct password

        // add money
        System.out.println(arifAcc.addMoney(3000));

        // withdraw
        System.out.println(arifAcc.withDrawMoney(2000,"arif123"));
        System.out.println(arifAcc.withDrawMoney(50000,"arif123"));
        System.out.println(arifAcc.withDrawMoney(50000,"random"));


        // change Password
        System.out.println(arifAcc.changePassword("arif123","arif1999"));
        System.out.println(arifAcc.fetchBalance("arif1999"));

        //calculate interest
        System.out.println("Interest for 5 years on current balance will be: " + arifAcc.calculateInterest(5));
    }
}