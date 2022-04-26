package StoreManager;

import java.util.Scanner;

public class UI {
  Scanner sc = new Scanner(System.in);

  public UI(){

  }
  public void GetWelcomeMsg(){
    System.out.println("------------------------------------------------------------");
    System.out.println("                                 -----");
    System.out.println("                                | - - |");
    System.out.println("Hello! Welcome to MarioPizza   |  -  |");
    System.out.println("                                  ---");
    System.out.println("Menukort.\n");
  }

  public int GiveOrderQuantity(){
    System.out.print("How many pizza would you like to order? : ");
    int qty = Integer.parseInt(sc.nextLine());
    return qty;
  }

}
