package food_delivery_system;

import static food_delivery_system.Database.GlobalInstance.db;

public class Food_Delivery_System {

    public static void main(String[] args) {
        db = new In_Memory_Database();
        Transaction_Factory trans_factory = new Transaction_Factory_Imp();
        Console_Parser_Transaction_Source source = new Console_Parser_Transaction_Source(trans_factory);
        Transaction_Application app = new Transaction_Application(source);
        app.run();
    }
    
}