package food_delivery_system;

public class Transaction_Factory_Imp implements Transaction_Factory {

    @Override
    public Transaction make_Add_Customer_Account_Transaction(int customer_id, String username, String password, String email) {
        return new Add_Customer_Account_Transaction(customer_id, username, password, email);
    }

    @Override
    public Transaction make_Delete_Customer_Transaction(int customer_id) {
        return new Delete_Customer_Transaction(customer_id);
    }

    @Override
    public Transaction make_Change_CNAme_Transaction(String name, int customer_id) {
        return new Change_CNAme_Transaction(name, customer_id);
    }

    @Override
    public Transaction make_Change_CPassword_Transaction(String password, int customer_id) {
        return new Change_CPassword_Transaction(password, customer_id);
    }

    @Override
    public Transaction make_Change_CEmail_Transaction(String email, int customer_id) {
        return new Change_CEmail_Transaction(email, customer_id);
    }

    @Override
    public Transaction make_Cahnge_NMembership_Transaction(int customer_id) {
        return new Cahnge_NMembership_Transaction(customer_id);
    }

    @Override
    public Transaction make_Change_GMembership_Transaction(int member_id, int customer_id) {
        return new Change_GMembership_Transaction(member_id, customer_id);
    }

    @Override
    public Transaction make_View_Account_Transaction(int customer_id) {
        return new View_Account_Transaction(customer_id);
    }

    @Override
    public Transaction make_View_Menu_Transaction(String location) {
        return new View_Menu_Transaction(location);
    }

    @Override
    public Transaction make_Make_Order_Transaction() {
        return new Make_Order_Transaction();
    }

    @Override
    public Transaction make_Add_To_Cart_Transaction(String dish_name) {
        return new Add_To_Cart_Transaction(dish_name);
    }

    @Override
    public Transaction make_Remove_From_Cart_Transaction(String dish_name) {
        return new Remove_From_Cart(dish_name);
    }

    @Override
    public Transaction make_View_Cart_Transaction() {
        return new View_Cart_Transaction();
    }

    @Override
    public Transaction make_Checkout_Transaction(int c_id) {
        return new Checkout_Transaction(c_id);
    }

    @Override
    public Transaction make_Place_Order_Transaction() {
        return new Place_Order_Transaction();
    }

}
