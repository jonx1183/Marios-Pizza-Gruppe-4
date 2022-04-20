package Pizza;

public class ID {

    private int pizzaID;
    private String orderID;
    private int estimation;

    public ID(int pizzaID, String orderID, int estimation){
        this.orderID = orderID;
        this.estimation = estimation;
        this.pizzaID = pizzaID;
    }

    public String getOrderID(){
        return orderID;
    }
    public int getPizzaID(){
        return pizzaID;
    }
    public int getEstimation(){
        return estimation;
    }

    public void setPizzaID(int pizzaID){
        this.pizzaID = pizzaID;
    }
    public void setOrderID(String orderID){
        this.orderID = orderID;
    }
    public void setEstimation(int estimation){
        this.estimation = estimation;
    }
}
