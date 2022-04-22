package Controller;

import StoreItems.Menu;
import StoreManager.OrderManager;

public class Controller {

    private boolean gameOn = true;

    OrderManager _management = new OrderManager();
    Menu _menu = new Menu();



    public void go(){
      gameOn();
    }

    public void gameOn(){

        while(gameOn == true){

            _menu.PrintMenu();


            _management.viewOrder();
            _management.addOrderToQueue();
            _management.viewQueueList();

        }
    }

}

