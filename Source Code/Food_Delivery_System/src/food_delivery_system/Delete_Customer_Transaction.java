package food_delivery_system;

import static food_delivery_system.Database.GlobalInstance.db;

public class Delete_Customer_Transaction implements Customer_Transaction {
    
    private final int customer_id;

    public Delete_Customer_Transaction(int customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public void execute() {
        db.delete_Customer_Account(customer_id);
        System.out.println("\n--->>> Account is deleted successfully");
    }
    
    
    
}
