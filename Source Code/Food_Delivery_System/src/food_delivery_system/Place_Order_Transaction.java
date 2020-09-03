package food_delivery_system;

public class Place_Order_Transaction implements Customer_Transaction {

    @Override
    public void execute() {

        System.out.println("\n--->>> Your order is placed Successfully");
        System.out.println("\n--->>> You may relax and wait for a delicious meal");

    }

}
