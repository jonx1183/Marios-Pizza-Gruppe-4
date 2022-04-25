package StoreItems;

import Interfaces.IItem;

import java.util.*;

public class Menu
{
  public Dictionary<Integer, IItem> menuKort;
  private Integer bestillingsNr = 0;
  private StoreDataBase _data;
  private String answer;

  //Scanner scan = new Scanner(System.in);

  public Menu(){
    menuKort = new Hashtable<>();
    _data = new StoreDataBase();
  }

  public Dictionary<Integer, IItem> getMenuKort(){
    // to get menu list from storedatabase
    List<IItem> tmpContainer = _data.createMenu();
    for (int i = 0; i < tmpContainer.size(); i++)
    {
      // to populate the menukort
      menuKort.put(bestillingsNr, tmpContainer.get(i));
      if (bestillingsNr ==null){
        System.out.println("that is not a number");
      } else if(bestillingsNr < 13){
      bestillingsNr++;
      }
    }
    return menuKort;
  }
  
  public void PrintMenu(){
    System.out.println(" ---MENU KORT--- ");
    Dictionary<Integer, IItem> tmpValue = getMenuKort();
    int pizzaNr = 1;

    for (int i = 0; i < tmpValue.size(); i++){
      System.out.println( pizzaNr + " " + tmpValue.get(i));
      //skal tælle pizzaer op til 14 og ikke mere
      pizzaNr++;
    }
      System.out.println();
  }
  

}
