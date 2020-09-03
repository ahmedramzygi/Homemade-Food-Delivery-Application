package food_delivery_system;

public interface Transaction_Factory {

    Transaction make_Add_Customer_Account_Transaction(int customer_id, String username, String password, String email);

    Transaction make_Delete_Customer_Transaction(int customer_id);

    Transaction make_Change_CNAme_Transaction(String name, int customer_id);

    Transaction make_Change_CPassword_Transaction(String password, int customer_id);

    Transaction make_Change_CEmail_Transaction(String email, int customer_id);

    Transaction make_Cahnge_NMembership_Transaction(int customer_id);

    Transaction make_Change_GMembership_Transaction(int member_id, int customer_id);

    Transaction make_View_Account_Transaction(int customer_id);

    Transaction make_View_Menu_Transaction(String location);

    Transaction make_Make_Order_Transaction();

    Transaction make_Add_To_Cart_Transaction(String dish_name);

    Transaction make_Remove_From_Cart_Transaction(String dish_name);

    Transaction make_View_Cart_Transaction();

    Transaction make_Checkout_Transaction(int c_id);
    
    Transaction make_Place_Order_Transaction();

}
