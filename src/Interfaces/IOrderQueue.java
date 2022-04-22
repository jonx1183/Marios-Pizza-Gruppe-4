package Interfaces;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Queue;

public interface IOrderQueue {

  //int GetOrderId();
  void AddOrder(Queue<IOrder> lst, IOrder order);
  void DeleteOrder(Queue<IOrder> lst);
}
