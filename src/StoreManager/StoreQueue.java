package StoreManager;

import Interfaces.IOrder;
import Interfaces.IOrderQueue;
import java.util.LinkedList;
import java.util.Queue;

public class StoreQueue implements IOrderQueue
{

  public StoreQueue(){

  }


  public void AddOrder(Queue<IOrder> lst,IOrder order) {
    lst.add(order);
  }

  public void DeleteOrder(Queue<IOrder> lst) {
    //Måske skal den erstattes med remove?
    lst.poll();
  }

  /*
  // Overriding toString() method of String class
  @Override
  public String toString() {
    return
  }

   */
}
