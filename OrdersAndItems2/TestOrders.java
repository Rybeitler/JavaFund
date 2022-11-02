import java.util.ArrayList;
import java.util.Arrays;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item mocha = new Item("mocha", 3.5);
        Item latte = new Item("latte", 4.0);
        Item dripCoffee = new Item("drip coffee", 2.5);
        Item capuccino = new Item("capuccino", 3.0);
        // Order variables -- order1, order2 etc.
        Order guestOrder1 = new Order();
        Order guestOrder2 = new Order();

        Order nameOrder1 = new Order("Jeff");
        Order nameOrder2 = new Order("Annie");
        Order nameOrder3 = new Order("Abed");

        guestOrder1.addItem(mocha);
        guestOrder1.addItem(latte);
        guestOrder2.addItem(latte);
        guestOrder2.addItem(dripCoffee);
        nameOrder1.addItem(dripCoffee);
        nameOrder1.addItem(capuccino);
        nameOrder2.addItem(capuccino);
        nameOrder2.addItem(latte);
        nameOrder3.addItem(mocha);
        nameOrder3.addItem(dripCoffee);
        nameOrder3.addItem(latte);
        nameOrder3.addItem(capuccino);

        guestOrder1.setReady(true);
        nameOrder2.setReady(true);
        nameOrder3.setReady(true);

        // Application Simulations
        guestOrder1.display();
        guestOrder2.display();
        nameOrder1.display();
        nameOrder2.display();
        nameOrder3.display();
        System.out.println("--------------------\n");
        System.out.println(nameOrder2.getStatusMessage());
        System.out.println("--------------------\n");
        System.out.println(nameOrder3.getOrderTotal());
    }
}
