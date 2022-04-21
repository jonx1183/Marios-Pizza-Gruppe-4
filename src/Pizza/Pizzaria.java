package Pizza;

public class Pizzaria {

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
