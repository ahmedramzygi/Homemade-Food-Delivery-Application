package food_delivery_system;

import java.util.List;

public interface Database {

    class GlobalInstance {

        public static Database db;
    }

    void add_Customer_Account(int c_id, Customer_Account ca);

    void delete_Customer_Account(int c_id);

    Customer_Account get_Customer_Account(int c_id);

    void add_Membership(int member_id, Customer_Account ca);

    void remove_Membership(int member_id);

    Customer_Account get_Membership(int member_id);

    //void add_Chef_Account(int ch_id, Chef_Account cha);
    //void delete_Chef_Account(int ch_id);
    //Chef_Account get_Chef_Account(int ch_id);
    void add_dish(Dish d);

    Dish get_Dish(String dish_name);

    List<Dish> get_menu(String location);
    
    void create_cart();
    
    Cart get_Cart();

}
