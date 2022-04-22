package Controller;

import StoreItems.Menu;
import StoreItems.StoreDataBase;
import StoreManager.OrderManager;

public class Main {

    StoreDataBase menu = new StoreDataBase();



    public void go(){



        OrderManager _management = new OrderManager();
        Menu _menu = new Menu();

        _menu.PrintMenu();


        _management.ViewOrder();
        _management.AddOrderToQueue();
        _management.ViewQueueList();




    }
    public static void main(String[] args) {


        new Main().go();

    }
}
