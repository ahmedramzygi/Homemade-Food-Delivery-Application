package food_delivery_system;

import static food_delivery_system.Database.GlobalInstance.db;

public class View_Account_Transaction implements Transaction {

    private final int customer_id;

    public View_Account_Transaction(int customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public void execute() {

        Customer_Account ca = db.get_Customer_Account(customer_id);
        if (ca != null) {
            System.out.println("\n--->>> ID: " + db.get_Customer_Account(customer_id).getCustpmer_id());
            System.out.println("--->>> Name: " + db.get_Customer_Account(customer_id).getUsername());
            System.out.println("--->>> Password: " + db.get_Customer_Account(customer_id).getPassword());
            System.out.println("--->>> Email: " + db.get_Customer_Account(customer_id).getEmail());
            System.out.println("--->>> Membership: " + db.get_Customer_Account(customer_id).view_mb());
            System.out.println("--->>> Payment method: " + db.get_Customer_Account(customer_id).view_pm());
        }

    }

}
