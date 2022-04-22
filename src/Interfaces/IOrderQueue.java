package Interfaces;

import java.text.DateFormat;
import java.time.LocalDate;

public interface IOrderQueue {

  int GetOrderId();
  void AddOrder(IOrder order);
  void DeleteOrder(IOrder order);
}
