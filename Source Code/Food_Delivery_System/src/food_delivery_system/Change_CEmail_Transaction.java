package food_delivery_system;

public class Change_CEmail_Transaction extends Change_Customer_Account_Transaction {
    
    private final String email;

    public Change_CEmail_Transaction(String email, int customer_id) {
        super(customer_id);
        this.email = email;
    }

    @Override
    protected void change(Customer_Account ca) {
        
        ca.setEmail(email);
        System.out.println("\n--->>> Email changed successfully");
        
    }
    
}
