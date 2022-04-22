package StoreItems;
import Interfaces.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.PrimitiveIterator;

public class Pizza implements IItem
{
  private String name;
  private String description;
  private Integer Price;

  public Pizza(String name, String description, Integer price)
  {
    this.name = name;
    this.description = description;
    this.Price = price;
  }

  public int GetCost() {
    return this.Price;
  }


  public String GetName() {
    return this.name;
  }


  public String GetDescription() {
    return this.description;
  }

  private NumberFormat ConvertToDanishCurrency(){
    NumberFormat nf3 = NumberFormat.getInstance(new Locale("da", "DK"));
    return nf3;
  }

  // Overriding toString() method of String class
  @Override
  public String toString() {
    return GetName() + " : " + GetDescription() + "....." + ConvertToDanishCurrency().format(GetCost());
  }
}
