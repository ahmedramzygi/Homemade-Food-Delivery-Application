package food_delivery_system;

import static food_delivery_system.Database.GlobalInstance.db;

public abstract class Change_Customer_Account_Transaction implements Customer_Transaction {
    
    private final int customer_id;

    public Change_Customer_Account_Transaction(int customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public void execute() {
        
        Customer_Account ca = db.get_Customer_Account(customer_id);
        if(ca != null)
            change(ca);
        
    }
    
    protected abstract void change(Customer_Account ca);
    
}
