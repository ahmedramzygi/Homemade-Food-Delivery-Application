package food_delivery_system;

public class Transaction_Application extends Application {

    private final Transaction_Source source;

    public Transaction_Application(Transaction_Source source) {
        this.source = source;
    }

    public void run() {
        Transaction trans;
        while ((trans = source.get_transaction()) != null) {
            trans.execute();
        }
    }
    

}
