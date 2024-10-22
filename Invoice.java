public class Invoice {
    private int id ;
    private double amount ;
    private Customer customer ;
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.amount = amount;
        this.customer = customer;
    }
    public int getId() {
        return id;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public int getCustomerId() {
        return customer.getId();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount() {
        return amount - ((customer.getDiscount()*amount)/100);
    }
    public String toString() {
        return "Invoice [ ID: " + id + ",Customer=" + customer + ",Amount: " + amount + "]";
    }
}
