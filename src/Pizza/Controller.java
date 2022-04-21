package Pizza;

public class Controller {

    Menukort menukort = new Menukort();

    public void go(){
        menukort.pizzaMenu();
        menukort.whichKey();
        hotKeyMenu();


    }

    public void hotKeyMenu(){
        switch(menukort.answer){
            case "menu","m" -> menukort.pizzaMenu();

        }
    }

}
