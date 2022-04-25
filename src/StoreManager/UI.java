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
    System.out.println("Hello! Wellcome to MarioPizza   |  -  |");
    System.out.println("                                  ---");
    System.out.println("Please Find our order list on the Menu Kort.\n");
  }

  public int GiveOrderQuantity(){
    System.out.print("How many pizza would you like to order? : ");
    int qty = Integer.parseInt(sc.nextLine());
    return qty;
  }

  public  void SelectNextClientOrder(){
    System.out.println("Next Client..., Please Step forward!");
  }
}
