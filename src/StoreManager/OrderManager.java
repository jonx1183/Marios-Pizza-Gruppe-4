package StoreManager;

import Interfaces.IItem;
import Interfaces.IOrder;
import StoreItems.Menu;
import StoreItems.Pizza;

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


  public OrderManager()
  {
    _menu = new Menu();
    _storeQueue = new StoreQueue();
  }

  private IItem MAkeOrder(){
    Dictionary<Integer, IItem> menu = _menu.GetMenuKort();
    int orderNr = ChooseOrderNumber();
    IItem ChosenOrder = menu.get(orderNr - 1);
    return ChosenOrder;
  }
  public void ViewOrder(){
    currentPizza = MAkeOrder();
    System.out.println(" ---YOUR CHOICE--- ");
    System.out.println("NAme: " + currentPizza.GetName() + '\n'
        + "Description: " + currentPizza.GetDescription() + '\n'
        + "Price: " + currentPizza.GetCost());
    System.out.println();
    clientOrder = new Order(currentPizza, OrderState.Ready);
    System.out.println(" ---ORDER INFO--- ");
    System.out.println("OrderInfo => " + clientOrder.GetOrderItem() + "\nOrderStatus => "+ clientOrder.GetOrderStatus()
                        + "\nOrder Date & Time => " + clientOrder.GetOrderTime());
    System.out.println();
  }
  public IOrder SelectClientOrder(){
    IOrder tmpOrder = clientOrder;
    return tmpOrder;
  }
  public void AddOrderToQueue(){
    IOrder value = SelectClientOrder();
    _storeQueue.AddOrder(value);
  }
  public void RemoveOrderFromQueue(){
    IOrder value = SelectClientOrder();
    _storeQueue.DeleteOrder(value);
  }

  public void ViewQueueList(){
    int clientID = 1;
    System.out.println(" ---QUEUE INFO--- ");
    for (IOrder item: _storeQueue.QueueOverview) {
      System.out.println("Client ID: "+ clientID +" | Date&Time: "+item.GetOrderTime()+ " | OrderName: "+item.GetOrderItem()
                          +" | OrderStatus: " + item.GetOrderStatus());
    }
  }


  private int ChooseOrderNumber(){
    System.out.print("Hello, please choose a pizza by number: ");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    Integer orderValue = Integer.parseInt(input);
    System.out.println("Thank you ! you have chosen nr: " + orderValue +'\n');
    return orderValue;
  }
}
