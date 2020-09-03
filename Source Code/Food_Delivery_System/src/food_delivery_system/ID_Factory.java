package food_delivery_system;

public class ID_Factory {
    
    private static int unique_customer_id = 1000;
    private static int unique_member_id = 1500;
    
    public static int get_customer_id() {
        return ++unique_customer_id;
    }
    
    public static int get_member_id() {
        return ++unique_member_id;
    }
    
}
