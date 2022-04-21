package Pizza;

import java.util.ArrayList;
import java.util.Scanner;


public class Menukort {

   String answer;

 Scanner scan = new Scanner(System.in);

  public void pizzaer(){
    ArrayList<String> pizza = new ArrayList<String>();

    pizza.add("");
    pizza.add("1: Vesuvio" + "\n");
    pizza.add("2: Amerikaner" + "\n");
    pizza.add("3: Cacceatore" + "\n");
    pizza.add("4: Carbona" + "\n");
    pizza.add("Dennis" + "\n");
    pizza.add("Beril" + "\n");
    pizza.add("Silvia" + "\n");
    pizza.add("Victoria" + "\n" );
    pizza.add("Toronfo" + "\n");
    pizza.add("Capricciosa" + "\n");
    pizza.add("Hawai" + "\n");
    pizza.add("Le Blissola" + "\n");
    pizza.add("Venezia" + "\n");
    pizza.add("Mafia"+ "\n");

    //System.out.println(pizza.toString());

    //På denne måde kan man "tage" pizzaen
    //String pizza1 = pizza.get(1);

    //System.out.println(pizza1);


  }
  public void

  public void whichKey(){

    answer = scan.nextLine().toLowerCase();
  }

}
