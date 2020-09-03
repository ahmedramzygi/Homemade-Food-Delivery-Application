package food_delivery_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class In_Memory_Database implements Database {

    private final Map<Integer, Customer_Account> customers_accounts = new HashMap<Integer, Customer_Account>();
    private final Map<Integer, Customer_Account> gold_members = new HashMap<Integer, Customer_Account>();
    private final List<Dish> menu = new ArrayList();

    @Override
    public void add_Customer_Account(int c_id, Customer_Account ca) {
        customers_accounts.put(c_id, ca);
    }

    @Override
    public void delete_Customer_Account(int c_id) {
        customers_accounts.remove(c_id);
    }

    @Override
    public Customer_Account get_Customer_Account(int c_id) {
        return customers_accounts.get(c_id);
    }

    @Override
    public void add_Membership(int member_id, Customer_Account ca) {
        gold_members.put(member_id, ca);
    }

    @Override
    public void remove_Membership(int member_id) {
        gold_members.remove(member_id);
    }

    @Override
    public Customer_Account get_Membership(int member_id) {
        return gold_members.get(member_id);
    }

//    @Override
//    public void add_Chef_Account(int ch_id, Chef_Account cha) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void delete_Chef_Account(int ch_id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Customer_Account get_Chef_Account(int ch_id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    @Override
//    public void add_dish(String location, Dish d) {
//        location_menu.put(location, d);
//    }
    @Override
    public void add_dish(Dish d) {
        menu.add(d);
    }

    @Override
    public Dish get_Dish(String dish_name) {

        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i).getDish_name().equals(dish_name)) {
                return menu.get(i);
            }
        }
        return null;
    }
    
    

    @Override
    public List<Dish> get_menu(String location) {

        switch (location) {
            case "nasrcity":
                return menu.subList(0, 8);
            case "korba":
                return menu.subList(8, 13);
            case "october":
                return menu.subList(13, 18);
            default:
                break;
        }

        return null;
    }

    private Cart c1;
    @Override
    public void create_cart() {
        c1 = new Cart();
    }

    @Override
    public Cart get_Cart() {
        return c1;
    }
    
    
    
    
    
    
    

}
