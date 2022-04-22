package StoreManager;

import Interfaces.IItem;
import Interfaces.IOrder;
import StoreItems.Pizza;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Order implements IOrder
{
  private List<IItem> _order;
  private OrderState _state;
  private LocalDateTime _time ;
  public int clientID = 1;

  public Order(List<IItem> pizza, OrderState state){
    this._order = pizza;
    this._state = state;
    this._time = LocalDateTime.now();
  }

  public List<IItem> getOrderItem() {
    return this._order;
  }

  private List<IItem> GetItemList(){
    return this._order;
  }

  public void GetOrder()
  {
    List<IItem> tmpValue = GetItemList();
    for (IItem pizza: tmpValue)
    {
      System.out.println("Orderinfo => " + pizza.GetName()+ ": "+ pizza.GetDescription()
                        +"........" + pizza.GetCost());
    }
  }

  public int GetClientId() {
    return this.clientID ++;
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
