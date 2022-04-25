package StoreManager;

import Controller.Controller;
import Interfaces.IItem;
import Interfaces.IOrder;
import StoreItems.Menu;
import StoreItems.Pizza;

import javax.naming.ldap.Control;
import java.util.*;

public class OrderManager
{

  Menu _menu;
  // global variable for current chosen pizza
  List<IItem> currentPizzaOrder = new ArrayList<>();
  IOrder clientOrder;
  StoreQueue _storeQueue;
  UI _UIcontext;
  boolean isOrdering;
  int orderNr;
  IItem ChosenOrder;
  List<IItem> listOfChosenOrder;
  public Queue<IOrder> lst;


  public OrderManager()
  {
    _menu = new Menu();
    _storeQueue = new StoreQueue();
    _UIcontext = new UI();
    listOfChosenOrder = new ArrayList<>();
    lst = new LinkedList<>();
  }

  private List<IItem> makeOrder(){
    Dictionary<Integer, IItem> menu = _menu.getMenuKort();
    //listOfChosenOrder.clear();
    int qty = _UIcontext.GiveOrderQuantity();
    isOrdering = true;
    while (isOrdering){
      if (qty == 1){
        System.out.println("Please choose a pizza by number: ");
        System.out.print("Enter a pizza Nr:");
        orderNr = chooseOrderNumber();
        ChosenOrder = menu.get(orderNr - 1); // -1 beacuse In GetMenu() index start by zero
        listOfChosenOrder.add(ChosenOrder);
        isOrdering = false;
      }else {
        System.out.println("Please choose a pizza by number:  ");
        for (int i =0; i < qty; i++){
          System.out.print("Enter a pizza Nr:");
          orderNr = chooseOrderNumber();
          System.out.println("You have chosen nr: " + orderNr +'\n');
          ChosenOrder = menu.get(orderNr - 1); // -1 beacuse In GetMenu() index start by zero
          listOfChosenOrder.add(ChosenOrder);
          isOrdering = false;
        }
      }
    }
    return listOfChosenOrder;
  }
  public void viewOrder(){
    currentPizzaOrder.clear();
    currentPizzaOrder = makeOrder();
    System.out.println(" ---YOUR CHOICE--- ");
    /*
    for (int i = orderNr; i < currentPizzaOrder.size(); i++ ){
      System.out.println("NAme: " + currentPizzaOrder.get(i).GetName() + '\n'
          + "Description: " + currentPizzaOrder.get(i).GetDescription() + '\n'
          + "Price: " + currentPizzaOrder.get(i).GetCost());
    }

     */

    for (IItem item: currentPizzaOrder)
    {
      System.out.println("NAme: " + item.GetName() + '\n'
          + "Description: " + item.GetDescription() + '\n'
          + "Price: " + item.GetCost());
    }



    System.out.println();
    clientOrder = new Order(currentPizzaOrder, OrderState.NewOrder);
    System.out.println(" ---ORDER INFO--- ");
    clientOrder.GetOrder();
    System.out.println("OrderStatus => "+ clientOrder.GetOrderStatus()
                        + "\nOrder Date & Time => " + clientOrder.getOrderTime());
    System.out.println();
  }
  public IOrder SelectClientOrder(){
    IOrder tmpOrder = clientOrder;
    return tmpOrder;
  }
  public void AddOrderToQueue(){
    IOrder value = SelectClientOrder();
    _storeQueue.AddOrder(lst,value);
  }
  public void RemoveOrderFromQueue(){
    IOrder value = SelectClientOrder();
    _storeQueue.DeleteOrder(lst);
  }

  public void viewQueueList(){ // the bug is in the method, somehow copy the order to preview client
    AddOrderToQueue();
    System.out.println(" ---QUEUE INFO--- ");
    for (IOrder item: lst) {

      System.out.println("Client ID: "+ item.GetClientId()+" | Date&Time: "+item.getOrderTime()
                          + "\n| OrderName: "+item.getOrderItem()
                          +"\n| OrderStatus: " + item.GetOrderStatus() + "\n");

    }

  }

  public int chooseOrderNumber(){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    Integer orderValue = Integer.parseInt(input);

    return orderValue;
  }
}
