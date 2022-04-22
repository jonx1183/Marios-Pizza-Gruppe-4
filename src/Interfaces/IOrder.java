package Interfaces;

import StoreManager.OrderState;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface IOrder
{
  IItem getOrderItem();
  int GetClientId();
  String getOrderTime();
  OrderState GetOrderStatus();
  void ChangeOrderStatus(OrderState state);
}
