package food_delivery_system;

import static food_delivery_system.Database.GlobalInstance.db;

public class Add_To_Cart_Transaction implements Customer_Transaction {
    
    private final String dish_name;
    private Dish d;

    public Add_To_Cart_Transaction(String dish_name) {
        this.dish_name = dish_name;
    }

    @Override
    public void execute() {
        d = db.get_Dish(dish_name);
        db.get_Cart().o.getMy_order().add(d);
        System.out.println("\n--->>> Dish added successfully to yor cart");
        
    }
    
    
    
    
}
