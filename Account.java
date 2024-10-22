public class Account {
    public int id;
    public Customer customer;
    public double balance;
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public int getId() {

        return id;
    }
    public Customer getCustomer() {

        return customer;
    }
    public double getBalance() {

        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString() {
        return customer.toString() + " balance =$ " + Math.round(balance*100.0)/100.0;
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public Account deposit(double amount) {
        balance += amount;
        return this;
    }
    public Account withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return this;
        }
        else System.out.println( " Amount withdrawn exceeds the current balance");
        return this;
    }

}
