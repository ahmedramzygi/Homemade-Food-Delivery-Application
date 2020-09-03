package food_delivery_system;

import static food_delivery_system.Database.GlobalInstance.db;

public class Add_Customer_Account_Transaction implements Customer_Transaction {
    
    private final int customer_id;
    private final String username;
    private final String password;
    private final String email;

    public Add_Customer_Account_Transaction(int customer_id, String user_name, String password, String email) {
        this.customer_id = customer_id;
        this.username = user_name;
        this.password = password;
        this.email = email;
    }
    

    @Override
    public final void execute() {
        
        Membership mb = new No_Membership();
        Payment_Method pm = new Cash_Payment();
        Customer_Account ca = new Customer_Account(customer_id, username, password, email);
        ca.setMb(mb);
        ca.setPm(pm);
        db.add_Customer_Account(customer_id, ca);
        db.create_cart();
        System.out.println("\n--->>> Account Added Successfully");
        System.out.println("--->>> Your unique customer id is " + customer_id);
        System.out.println("--->>> You can now view menu and make order");
        
    }
    
    
}
