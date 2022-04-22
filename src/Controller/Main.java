package Controller;

import StoreItems.Menu;
import StoreItems.StoreDataBase;
import StoreManager.OrderManager;

public class Main {

    public void go(){



        OrderManager _management = new OrderManager();
        Menu _menu = new Menu();

        _menu.PrintMenu();


        _management.viewOrder();
        _management.addOrderToQueue();
        _management.viewQueueList();




    }
    public static void main(String[] args) {


        new Main().go();

    }
}
