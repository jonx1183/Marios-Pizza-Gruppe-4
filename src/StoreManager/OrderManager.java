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
  List<Order> currentPizzaOrder = new ArrayList<>();
  Order clientOrder;
  StoreQueue _storeQueue;
  UI _UIcontext;
  boolean isOrdering;
  int orderNr;
  IItem ChosenOrder;
  List<IItem> listOfChosenOrder=new ArrayList<>();
  ArrayList<IOrder> lst =new ArrayList<>();


  public OrderManager()
  {
    _menu = new Menu();
    _storeQueue = new StoreQueue();
    _UIcontext = new UI();
  }

  private Order makeOrder(){
    Dictionary<Integer, IItem> menu = _menu.getMenuKort();
    //listOfChosenOrder.clear();
    int qty = _UIcontext.GiveOrderQuantity();
    //isOrdering = true;

  /*    if (qty == 1){
        System.out.println("Please choose a pizza by number: ");
        System.out.print("Enter a pizza Nr:");
        orderNr = chooseOrderNumber();
        ChosenOrder = menu.get(orderNr - 1); // -1 beacuse In GetMenu() index start by zero
        listOfChosenOrder.add(ChosenOrder);
        isOrdering = false;
      }else {*/
        System.out.println("Please choose a pizza by number:  ");
        for (int i =0; i < qty; i++){
          System.out.print("Enter a pizza Nr:");
          orderNr = chooseOrderNumber();
          System.out.println("You have chosen nr: " + orderNr +'\n');
          ChosenOrder = menu.get(orderNr - 1); // -1 beacuse In GetMenu() index start by zero
          System.out.println(ChosenOrder + " THis is find pizza");
          listOfChosenOrder.add(ChosenOrder);
          isOrdering = false;
        }
    return new Order(listOfChosenOrder, OrderState.Preparing);
    }
   // return new Order(listOfChosenOrder, OrderState.Preparing);
   // return listOfChosenOrder;




  public void viewOrder2(){
    currentPizzaOrder.toString();
  }

  public void viewOrder(){
    //Skal måske væk
   // currentPizzaOrder.clear();

    //Denne her adder til jeres OrdreListe
    currentPizzaOrder.add(makeOrder());
    System.out.println(" ---YOUR CHOICE--- ");


   /* for (Order item: currentPizzaOrder)
    {
      System.out.println("NAme: " + item.getPizza.get + '\n'
          + "Description: " + item.GetDescription() + '\n'
          + "Price: " + item.GetCost());
    }*/

    //Dette printer jeres Ordre objekt - Den brugere jeres TOSTRING under Order.
    System.out.println();
    for (int i = 0; i < currentPizzaOrder.size(); i++) {
      System.out.println(currentPizzaOrder.get(i));
    }


    //clientOrder = new Order(currentPizzaOrder, OrderState.NewOrder);
    System.out.println(" ---ORDER INFO--- ");
   // clientOrder.GetOrder();
   // System.out.println("OrderStatus => "+ clientOrder.GetOrderStatus()
    //                    + "\nOrder Date & Time => " + clientOrder.getOrderTime());
    System.out.println();
  }
  public IOrder SelectClientOrder(){
    IOrder tmpOrder = clientOrder;
    return tmpOrder;
  }
  public void AddOrderToQueue(){
    IOrder value = SelectClientOrder();

    //_storeQueue.AddOrder(lst,value);
    lst.add(value);
  }
  public void RemoveOrderFromQueue(){
    IOrder value = SelectClientOrder();
    //_storeQueue.DeleteOrder(lst);
  }

  public void viewQueueList(){ // the bug is in the method, somehow copy the order to preview client
    AddOrderToQueue();
    System.out.println(" ---QUEUE INFO--- ");

   /* for (IOrder item: lst) {

      System.out.println("Client ID: "+ item.GetClientId()+" | Date&Time: "+item.getOrderTime()
                          + "\n| OrderName: "+item.getOrderItem()
                          +"\n| OrderStatus: " + item.GetOrderStatus() + "\n");

    }*/



  }

  public int chooseOrderNumber(){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    Integer orderValue = Integer.parseInt(input);

    return orderValue;
  }
}
