package food_delivery_system;

import static food_delivery_system.Database.GlobalInstance.db;
import java.util.List;


public class View_Menu_Transaction implements Customer_Transaction {
    
    private final String location;
    private List<Dish> my_menu;

    public View_Menu_Transaction(String location) {
        this.location = location;
    }

    @Override
    public void execute() {
        
        Load_Menu lm = new Load_Menu();
        lm.load_dishes();
        my_menu = db.get_menu(location);
        
        for (int i = 0; i< my_menu.size(); i++) {
            System.out.println("\n--->>> Chef Name: " + my_menu.get(i).getChef_name());
            System.out.println("--->>> Dish Name: " + my_menu.get(i).getDish_name());
            System.out.println("--->>> Dish Price: " + my_menu.get(i).getDish_price() + "\n");
        }
        
    }
    
    
    
    
}
