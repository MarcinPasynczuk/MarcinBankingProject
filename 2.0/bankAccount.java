public class bankAccount{
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String password;

    private String accountName;



//    public bankAccount(String accountName, String password){
//        if (Objects.equals(accountName, marcinAccount.getName) && Objects.equals(password, marcinAccount.getPassword())){
//            System.out.println("działą");
//        }
//    }



    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public bankAccount(int accountNumber, double balance, String customerName, String email, String password){
        System.out.println("done");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.password = password;

    }

    public bankAccount(int accountNumber, double balance) {

        this.accountNumber = 12345;
        this.balance = 0.00;
    }

    public bankAccount(int loginNumber, String password) {
    }

    // Getter & Setter accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }
    // Getter & Setter accountNumber

    // Getter & Setter balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }
    // Getter & Setter balance

    // Getter & Setter customerName
    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String newCustomerName){
        this.customerName = newCustomerName;
    }
    // Getter & Setter customerName

    // Getter & Setter email
    public String getEmail(){
        return email;
    }

    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    // Getter & Setter email


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void deposit(double howMuchDeposit){
        this.balance += howMuchDeposit;
        System.out.println(balance);
    }

    public void withdraw(double howMuchWithdraw){
        if (balance >= howMuchWithdraw){
            this.balance -= howMuchWithdraw;
            System.out.println(balance);}
        else {
            System.out.println("Balance is too low!");
        }

    }
}
