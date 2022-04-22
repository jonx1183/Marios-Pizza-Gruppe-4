package StoreItems;

import Interfaces.IItem;

import java.util.ArrayList;
import java.util.List;

public class StoreDataBase {



  public StoreDataBase() {
      }

    List<IItem> tempMenu = new ArrayList<IItem>();

    public List<IItem> CreateMenu () {
      tempMenu.add(new Pizza("Vesuvio", "tomatsauce, ost, skinke og oregano", 57));
      tempMenu.add(new Pizza("Amerikaner", "tomatsauce, ost, oksefars og oregano", 53));
      tempMenu.add(new Pizza("Cacciatore", "tomatsauce, ost, pepperoni og oregano", 57));
      tempMenu.add(new Pizza("Carbona", "tomatsauce, ost, Kødsauce, spaghetti, cocktailpølser og oregano", 63));
      tempMenu.add(new Pizza("Dennis", "tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano", 65));
      tempMenu.add(new Pizza("Bertil", "tomatsauce, ost, bacon og oregano", 57));
      tempMenu.add(new Pizza("silvia", "tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano", 61));
      tempMenu.add(new Pizza("Victoria", "tomatsauce, ost, skinke, ananas, champion, løg og oregano", 61));
      tempMenu.add(new Pizza("Toronfo", "tomatsauce, ost, skinke, bacon,kebab, chili og oregano", 61));
      tempMenu.add(new Pizza("Capricciosa", "tomatsauce, ost, skinke, champignon og oregano", 61));
      tempMenu.add(new Pizza("Hawai", "tomatsauce, ost, skinke , ananas og oregano", 61));
      tempMenu.add(new Pizza("Le Blissoia", "tomatsauce, ost, skinke, rejer og oregano", 61));
      tempMenu.add(new Pizza("Venezia", "tomatsauce, ost, skinke, bacon og oregano", 61));
      tempMenu.add(new Pizza("Cacciatore", "tomatsauce, ost, pepperoni, bacon, løg og oregano", 61));

      return tempMenu;
      }


  }




