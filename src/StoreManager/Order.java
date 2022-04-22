package StoreManager;

import Interfaces.IItem;
import Interfaces.IOrder;
import StoreItems.Pizza;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order implements IOrder
{
  private IItem _order;
  private OrderState _state;
  private LocalDateTime _time ;

  public Order(IItem pizza, OrderState state){
    this._order = pizza;
    this._state = state;
    this._time = LocalDateTime.now();
  }

  public IItem getOrderItem() {
    return this._order;
  }

  public String getOrderTime() {
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDate = this._time.format(myFormatObj);
    return formattedDate;
  }

  public OrderState GetOrderStatus() {
    return this._state;
  }

  public void ChangeOrderStatus(OrderState state) {
    this._state = state;
  }
}
