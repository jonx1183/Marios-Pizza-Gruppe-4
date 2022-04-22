package StoreManager;

import Controller.Controller;
import Interfaces.IItem;
import Interfaces.IOrder;
import StoreItems.Menu;
import StoreItems.Pizza;

import javax.naming.ldap.Control;
import java.util.Dictionary;
import java.util.Queue;
import java.util.Scanner;

public class OrderManager
{

  Menu _menu;
  // global variable for current chosen pizza
  IItem currentPizza;
  IOrder clientOrder;
  StoreQueue _storeQueue;
  UI _UIcontext;
  boolean isOrdering = true;
  int orderNr;
  IItem ChosenOrder;


  public OrderManager()
  {
    _menu = new Menu();
    _storeQueue = new StoreQueue();
    _UIcontext = new UI();
  }

  private IItem makeOrder(){
    Dictionary<Integer, IItem> menu = _menu.getMenuKort();
    int qty = _UIcontext.GiveOrderQuantity();

    while (isOrdering){
      if (qty == 1){
        System.out.println("Please choose a pizza by number: ");
        System.out.print("Enter a pizza Nr:");
        orderNr = chooseOrderNumber();
        System.out.println("You have chosen nr: " + orderNr +'\n');
        ChosenOrder = menu.get(orderNr - 1); // -1 beacuse In GetMenu() index start by zero
        isOrdering = false;
      }else {
        System.out.println("Please choose a pizza by number:  ");
        for (int i =0; i < qty; i++){
          System.out.print("Enter a pizza Nr:");
          orderNr = chooseOrderNumber();
          System.out.println("You have chosen nr: " + orderNr +'\n');
          ChosenOrder = menu.get(orderNr - 1); // -1 beacuse In GetMenu() index start by zero
          isOrdering = false;
        }
      }
    }
    return ChosenOrder;
  }
  public void viewOrder(){
    currentPizza = makeOrder();
    System.out.println(" ---YOUR CHOICE--- ");
    System.out.println("NAme: " + currentPizza.GetName() + '\n'
        + "Description: " + currentPizza.GetDescription() + '\n'
        + "Price: " + currentPizza.GetCost());
    System.out.println();
    clientOrder = new Order(currentPizza, OrderState.NewOrder);
    System.out.println(" ---ORDER INFO--- ");
    System.out.println("OrderInfo => " + clientOrder.getOrderItem() + "\nOrderStatus => "+ clientOrder.GetOrderStatus()
                        + "\nOrder Date & Time => " + clientOrder.getOrderTime());
    System.out.println();
  }
  public IOrder SelectClientOrder(){
    IOrder tmpOrder = clientOrder;
    return tmpOrder;
  }
  public void addOrderToQueue(){
    IOrder value = SelectClientOrder();
    _storeQueue.AddOrder(value);
  }
  public void RemoveOrderFromQueue(){
    IOrder value = SelectClientOrder();
    _storeQueue.DeleteOrder(value);
  }

  public void viewQueueList(){
    int clientID = 1;
    System.out.println(" ---QUEUE INFO--- ");
    for (IOrder item: _storeQueue.QueueOverview) {
      System.out.println("Client ID: "+ item.GetClientId()+" | Date&Time: "+item.getOrderTime()+ " | OrderName: "+item.getOrderItem()
                          +" | OrderStatus: " + item.GetOrderStatus() + "\n");

    }
  }


  public int chooseOrderNumber(){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    Integer orderValue = Integer.parseInt(input);

    return orderValue;
  }
}
