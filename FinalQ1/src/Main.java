public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Bank of America");
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(1234);
        bankAccount.setRoutingNumber(5678);
        bank.setBankAccount(bankAccount);
        System.out.println("Bank Name: " + bank.getBankName());
        System.out.println("Account Number: " + bank.getBankAccount().getAccountNumber());
        System.out.println("Routing Number: " + bank.getBankAccount().getRoutingNumber());
    }
}