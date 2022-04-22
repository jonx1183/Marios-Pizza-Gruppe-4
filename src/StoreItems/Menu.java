package StoreItems;

import Interfaces.IItem;

import java.util.*;

public class Menu
{
  public Dictionary<Integer, IItem> MenuKort;
  private Integer bestillingsNr = 0;
  private StoreDataBase _data;
  private String answer;

  Scanner scan = new Scanner(System.in);

  public Menu(){
    MenuKort = new Hashtable<Integer, IItem>();
    _data = new StoreDataBase();
  }

  public Dictionary<Integer, IItem> GetMenuKort(){
    // to get menu list from storedatabase
    List<IItem> tmpContainer = _data.CreateMenu();
    for (int i = 0; i < tmpContainer.size(); i++)
    {
      // to populate the menukort
      MenuKort.put(bestillingsNr, tmpContainer.get(i));
      bestillingsNr ++;
    }
    return MenuKort;
  }
  
  public void PrintMenu(){
    Dictionary<Integer, IItem> tmpValue = GetMenuKort();
    int pizzaNr = 1;
    for (int i = 0; i < tmpValue.size(); i++){
      System.out.println( pizzaNr + " " + tmpValue.get(i));
      pizzaNr++;
    }
      System.out.println();
      

  }
  

}
