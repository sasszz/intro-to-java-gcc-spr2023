public class Bank {
    private String bankName;
    private BankAccount bankAccount;
    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankAccount = bankAccount;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
