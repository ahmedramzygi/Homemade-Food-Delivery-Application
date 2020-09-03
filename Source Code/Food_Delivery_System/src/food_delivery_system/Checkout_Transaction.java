package food_delivery_system;

import static food_delivery_system.Database.GlobalInstance.db;
import java.util.List;

public class Checkout_Transaction implements Customer_Transaction {

    private final int customer_id;
    private List<Dish> order;
    double total_payment;

    public Checkout_Transaction(int customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public void execute() {

        order = db.get_Cart().o.getMy_order();
        System.out.println("\n#---------- Your Order Summary ----------#");
        db.get_Cart().o.getMy_order();
        for (int i = 0; i < order.size(); i++) {
            System.out.println("\n--->>> Dish: " + order.get(i).getDish_name());
            System.out.println("--->>> price: " + order.get(i).getDish_price());
            total_payment += order.get(i).getDish_price();
        }

        double final_payment = db.get_Customer_Account(customer_id).getMb().apply_discount(total_payment);

        System.out.println("\n#---------- Payment ----------#");
        System.out.println("\n--->>> Your total payment is: " + total_payment);
        System.out.println("\n--->>> Your total payment after Golden Membership discount is: " + final_payment);
        System.out.println("\n--->>> Your payment method is: " + db.get_Customer_Account(customer_id).view_pm());

    }

}
