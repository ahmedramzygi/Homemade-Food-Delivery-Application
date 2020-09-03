package food_delivery_system;

public class Change_CPassword_Transaction extends Change_Customer_Account_Transaction {
    
    private final String password;

    public Change_CPassword_Transaction(String password, int customer_id) {
        super(customer_id);
        this.password = password;
    }

    @Override
    protected void change(Customer_Account ca) {
        
        ca.setPassword(password);
        System.out.println("\n--->>> Paasword changed successfully");
        
    }
}
