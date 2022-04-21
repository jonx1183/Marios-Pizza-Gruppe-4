package Pizza;

public class Pizzaria {

    ID id = new ID();
    Menukort menukort = new Menukort();

    public void go(){
        menukort.pizzaer();
        menukort.whichKey();
        hotKeyMenu();


    }

    public void hotKeyMenu(){
        switch(menukort.answer){
            case "menu","m" -> menukort.pizzaer();

            case "menukort" -> menukort.whichKey();


        }
        System.out.println(menukort);
    }

}
