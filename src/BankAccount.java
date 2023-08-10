public interface BankAccount {
    String fetchBalance(String password);
    String addMoney(double amount);

    String withDrawMoney(double amount,String password);
    String changePassword(String oldPassword,String newPassword);
    double calculateInterest(int year);
}
