package food_delivery_system;

import static food_delivery_system.Database.GlobalInstance.db;

public class Remove_From_Cart implements Customer_Transaction {

    private final String dish_name;
    private Dish d;

    public Remove_From_Cart(String dish_name) {
        this.dish_name = dish_name;
    }

    @Override
    public void execute() {

        Dish d = db.get_Dish(dish_name);
        db.get_Cart().o.getMy_order().remove(d);
        System.out.println("--->>> Dish removed successfully");
    }

}
