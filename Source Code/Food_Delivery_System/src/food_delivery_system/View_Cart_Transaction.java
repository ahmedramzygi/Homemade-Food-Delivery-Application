package food_delivery_system;

import static food_delivery_system.Database.GlobalInstance.db;

public class View_Cart_Transaction implements Customer_Transaction {

    @Override
    public void execute() {
        System.out.println("\n--->>> Hera are your cart items\n");
        for (int i = 0; i < db.get_Cart().o.getMy_order().size(); i++) {

            System.out.println(db.get_Cart().o.getMy_order().get(i).getDish_name() + " : " + db.get_Cart().o.getMy_order().get(i).getDish_price());

        }

    }

}