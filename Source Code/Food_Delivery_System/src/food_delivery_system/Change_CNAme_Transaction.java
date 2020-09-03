package food_delivery_system;

public class Change_CNAme_Transaction extends Change_Customer_Account_Transaction {
    
    private final String name;

    public Change_CNAme_Transaction(String name, int customer_id) {
        super(customer_id);
        this.name = name;
    }

    @Override
    protected void change(Customer_Account ca) {
        
        ca.setUsername(name);
        System.out.println("\n--->>> Name changed successfully");
        
    }
    
}