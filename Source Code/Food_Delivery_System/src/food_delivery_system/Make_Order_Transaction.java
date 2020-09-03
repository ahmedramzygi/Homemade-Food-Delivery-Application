package food_delivery_system;

import static food_delivery_system.Database.GlobalInstance.db;

public class Make_Order_Transaction implements Customer_Transaction {

    @Override
    public void execute() {
        db.get_Cart().open_new_order();
        System.out.println("\n--->>> Order added successfully ... you may choose dishes");
    }

}
