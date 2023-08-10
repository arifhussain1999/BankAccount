import java.util.UUID;
public class SBIaccount extends Object implements BankAccount{
   private String name;
   private String accountNO;
   private String password;
   private double balance;
   final double rateOfInterest=7.1;
   final String IFSCcode="SBIN0016771";

    public SBIaccount() {
    }

    public SBIaccount(String name, String password, double balance) {
        this.name = name;
        this.accountNO = String.valueOf(UUID.randomUUID());
        this.password = password;
        this.balance = balance;
    }
public String getName(){
        return name;
}
public void setName(String name){
        this.name=name;
}
    public String getAccountNO() {
        return accountNO;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public String getIFSCCode() {
        return IFSCcode;
    }
    @Override

    public String fetchBalance(String password) {
        if(this.password.equals(password))
        {
            return "Your account balance is: " + this.balance;
        }
   return "Incorrect password";
    }

    @Override
    public String addMoney(double amount) {
        setBalance(getBalance()+amount);
        return "Money has been successfully added your current balance is:" + getBalance();
    }

    @Override
    public String withDrawMoney(double amount, String password) {
        if(this.password.equals(password))
        {
            if(this.balance<amount){
                return "Insufficient balance";
            }else{
                setBalance(getBalance()-amount);
                return "Money has been debited successfully your current balance is:" + getBalance();
            }
        }else{
            return "Incorrect password";
        }
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(getPassword().equals(oldPassword)){
           setPassword(newPassword);
            return "Password has been changed successfully";
        }
        else{
            return "Incorrect password";
        }
    }

    @Override
    public double calculateInterest(int year) {
        return (this.balance*rateOfInterest*year)/100;
    }
public String toString(){
return "SBIaccount{" +
        "name='" + name + '\'' +
        ", accountNo='" + accountNO + '\'' +
        ", password='" + password + '\'' +
        ", balance=" + balance +
        ", rateOfInterest=" + rateOfInterest +
        ", IFSCCode='" + IFSCcode + '\'' +
        '}';
}
}
