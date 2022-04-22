import Pizza.Controller;
import StoreItems.Menu;
import StoreManager.OrderManager;

public class Main {

    public static void main(String[] args) {
        //new Controller().go();

        OrderManager _management = new OrderManager();
        Menu _menu = new Menu();


        _menu.PrintMenu();
        System.out.println();
        _management.ViewOrder();
        _management.AddOrderToQueue();
        _management.ViewQueueList();


    }
}
