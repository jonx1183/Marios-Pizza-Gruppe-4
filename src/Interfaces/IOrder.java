package Interfaces;

import StoreManager.OrderState;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface IOrder
{
  IItem getOrderItem();
  String getOrderTime();
  OrderState GetOrderStatus();
  void ChangeOrderStatus(OrderState state);
}
