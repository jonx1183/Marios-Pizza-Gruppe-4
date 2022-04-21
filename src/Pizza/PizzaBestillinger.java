package Pizza;

import java.util.List;

public class PizzaBestillinger {
  List<IItem> menuItems;

  public List<IItem> GetMenu()
  {
    menuItems = new List<Item>()
    {
                new Pizza("Vesuvio","tomatsauce, ost, skinke og oregano",57),
                new Pizza("Amerikaner","tomatsauce, ost, oksefars og oregano",53),
                new Pizza("Cacciatore","tomatsauce, ost, pepperoni og oregano",57),
                new Pizza("Carbona","tomatsauce, ost, Kødsauce, spaghetti, cocktailpølser og oregano",63),
                new Pizza("Dennis","tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano",65),
                new Pizza("Bertil","tomatsauce, ost, bacon og oregano",57),
                new Pizza("silvia","tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano",61),
                new Pizza("Victoria","tomatsauce, ost, skinke, ananas, champion, løg og oregano",61),
                new Pizza("Toronfo","tomatsauce, ost, skinke, bacon,kebab, chili og oregano",61),
                new Pizza("Capricciosa","tomatsauce, ost, skinke, champignon og oregano",61),
                new Pizza("Hawai","tomatsauce, ost, skinke , ananas og oregano",61),
                new Pizza("Le Blissoia","tomatsauce, ost, skinke, rejer og oregano",61),
                new Pizza("Venezia","tomatsauce, ost, skinke, bacon og oregano",61),
                new Pizza("Cacciatore","tomatsauce, ost, pepperoni, bacon, løg og oregano",61),
    };
    return menuItems;
  }
}