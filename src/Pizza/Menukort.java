package Pizza;

import Interfaces.IItem;

import java.util.ArrayList;
import java.util.Scanner;


public class Menukort {
   String answer;

 Scanner scan = new Scanner(System.in);

  public void pizzaMenu(){

    ArrayList<String> pizza = new ArrayList<String>();

    pizza.add("");
    pizza.add("1: Vesuvio" + "\n");
    pizza.add("2: Amerikaner" + "\n");
    pizza.add("3: Cacceatore" + "\n");
    pizza.add("4: Carbona" + "\n");
    pizza.add("5: Dennis" + "\n");
    pizza.add("6: Beril" + "\n");
    pizza.add("7: Silvia" + "\n");
    pizza.add("8: Victoria" + "\n" );
    pizza.add("9: Toronfo" + "\n");
    pizza.add("10: Capricciosa" + "\n");
    pizza.add("11: Hawai" + "\n");
    pizza.add("12: Le Blissola" + "\n");
    pizza.add("13: Venezia" + "\n");
    pizza.add("14: Mafia"+ "\n");

    for (int i = 0; i < pizza.size(); i++) {
      System.out.println(pizza.get(i));
    }
  }

  public void whichKey(){
    answer = scan.nextLine();
  }

  /*
  Menukort menu = new Menukort();
  List<IItem> tmpMenuCart;


  private int autoID = 1;
  private int autoClientID = 1;

  //creating a instance in order to share files
  public static Menukort _instance;

  // to access listview in queue form
  public ListView lstViewMenuCart;

  BestillingsOversigt sndForm = new BestillingsOversigt();
  public Menukort()
  {
    InitializeComponent();
    // whenever this class is called, the instance is saved
    _instance = this;
    lstViewMenuCart = listMenu;
    tmpMenuCart = menu.GetMenu();

  }

  private void InitializeComponent() {
  }


  {
    for (int i = 0; i < tmpMenuCart.Count; i++)
    {
      IItem tmpItem = tmpMenuCart[i];
      AddToListView(tmpItem.GetName(), tmpItem.GetDescription(),
          tmpItem.GetCost());
    }
  }

  private void AddToListView(String getName, PizzaBestillinger getDescription, int getCost) {
  }

 */
}

