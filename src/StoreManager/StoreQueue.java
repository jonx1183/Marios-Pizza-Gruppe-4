package StoreManager;

import Interfaces.IOrder;
import Interfaces.IOrderQueue;
import java.util.LinkedList;
import java.util.Queue;

public class StoreQueue implements IOrderQueue
{
  private int OrderId = 1;
  public Queue<IOrder> QueueOverview;


  public StoreQueue(){
    QueueOverview = new LinkedList<>();
  }
  public int GetOrderId() {
    return OrderId;
  }

  public void AddOrder(IOrder order) {
    QueueOverview.add(order);
  }

  public void DeleteOrder(IOrder order) {
    QueueOverview.poll();
  }
}
