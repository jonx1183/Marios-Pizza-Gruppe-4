package Interfaces;

import StoreManager.OrderState;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface IOrder
{
  List<IItem> getOrderItem();
  public void GetOrder();
  int GetClientId();
  String getOrderTime();
  OrderState GetOrderStatus();
  void ChangeOrderStatus(OrderState state);
}
