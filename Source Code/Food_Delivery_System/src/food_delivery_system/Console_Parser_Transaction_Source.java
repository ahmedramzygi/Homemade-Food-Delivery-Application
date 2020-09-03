package food_delivery_system;

import java.io.BufferedReader;
import java.util.Scanner;

public class Console_Parser_Transaction_Source implements Transaction_Source {

    private final Transaction_Factory factory;
    private Scanner sc = new Scanner(System.in);
    private String username, password, email;
    private int customer_id, member_id;

    public Console_Parser_Transaction_Source(Transaction_Factory factory) {
        this.factory = factory;
    }

    @Override
    public Transaction get_transaction() {
        System.out.println("\nChoose a = add account, d = delete account, v = view_account, cn = change_name, cp = change_password, ce = change_email, bg = become gold member, rg = remove golde membership, vm = view menu, mo = make order, ac = add to cart");
        System.out.println("Choose vm = view menu, mo = make order, ac = add to cart, rc = remove from cart, vc = show cart, ch = checkout, po = place order\n");
        String line = sc.next();
        return parse_line(line);
    }

    public Transaction parse_line(String line) {
        switch (line) {
            case "a":
                System.out.println("\nEnter name:");
                username = sc.next();
                System.out.println("\nEnter password:");
                password = sc.next();
                System.out.println("\nEnter email:");
                email = sc.next();
                customer_id = ID_Factory.get_customer_id();
                return factory.make_Add_Customer_Account_Transaction(customer_id, username, password, email);
            case "d":
                System.out.println("\nEnter custoner ID:");
                customer_id = sc.nextInt();
                return factory.make_Delete_Customer_Transaction(customer_id);
            case "v":
                System.out.println("\nEnter customer ID:");
                customer_id = sc.nextInt();
                return factory.make_View_Account_Transaction(customer_id);
            case "cn":
                System.out.println("\nEnter customer ID:");
                customer_id = sc.nextInt();
                System.out.println("\nEnter new name:");
                String new_name = sc.next();
                return factory.make_Change_CNAme_Transaction(new_name, customer_id);
            case "cp":
                System.out.println("\nEnter customer ID:");
                customer_id = sc.nextInt();
                System.out.println("\nEnter new password:");
                String new_password = sc.next();
                return factory.make_Change_CPassword_Transaction(new_password, customer_id);
            case "ce":
                System.out.println("\nEnter customer ID: ");
                customer_id = sc.nextInt();
                System.out.println("\nEnter new email:");
                String new_email = sc.next();
                return factory.make_Change_CEmail_Transaction(new_email, customer_id);
            case "bg":
                System.out.println("\nEnter customer ID: ");
                customer_id = sc.nextInt();
                member_id = ID_Factory.get_member_id();
                return factory.make_Change_GMembership_Transaction(member_id, customer_id);
            case "rg":
                System.out.println("\nEnter customer ID: ");
                customer_id = sc.nextInt();
                return factory.make_Cahnge_NMembership_Transaction(customer_id);
            case "vm":
                System.out.println("\nChoose aamong available loctions: nasrcity, korba, october");
                String location = sc.next();
                return factory.make_View_Menu_Transaction(location);
            case "mo":
                return factory.make_Make_Order_Transaction();
            case "ac":
                System.out.println("\nEnter dish name: ");
                String dn1 = sc.next();
                return factory.make_Add_To_Cart_Transaction(dn1);
            case "rc":
                System.out.println("\nEnter dish name: ");
                String dn2 = sc.next();
                return factory.make_Remove_From_Cart_Transaction(dn2);
            case "vc":
                return factory.make_View_Cart_Transaction();
            case "ch":
                System.out.println("\nEnter customer ID:");
                customer_id = sc.nextInt();
                return factory.make_Checkout_Transaction(customer_id);
            case "po":
                return factory.make_Place_Order_Transaction();
            default:
                break;
        }

        return null;
    }

}
